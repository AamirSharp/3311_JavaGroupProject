package main;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AiBookingTest {

    private Room room;
    private User user;

    @BeforeEach
    void setUp() {
        AppData.bookings = new ArrayList<>();
        room = new Room("101", "Building A", 10, "AVAILABLE");
        user = new Admin("adm1", "admin@test.com", "pass", "ADM01");
    }

    // ---------- constructor / getters ----------

    // 1. Constructor stores all fields correctly
    @Test
    void testConstructorAndGetters() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);
        Booking b = new Booking("BK1", room, start, end, "PENDING", 50.0, 100.0, null, user);

        assertEquals("BK1", b.getBookingId());
        assertEquals(room, b.getRoom());
        assertEquals(start, b.getStartTime());
        assertEquals(end, b.getEndTime());
        assertEquals("PENDING", b.getStatus());
        assertEquals(50.0, b.getDeposit(), 0.0001);
        assertEquals(100.0, b.getTotal(), 0.0001);
        assertNull(b.getCheckInTime());
        assertEquals(user, b.getBookedBy());
    }

    // 2. createBooking sets status to BOOKED
    @Test
    void testCreateBookingSetsStatus() {
        Booking b = new Booking("BK2", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "PENDING", 50.0, 100.0, null, user);
        b.createBooking();
        assertEquals("BOOKED", b.getStatus());
    }

    // 3. cost() returns total
    @Test
    void testCost() {
        Booking b = new Booking("BK3", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);
        assertEquals(150.0, b.cost(), 0.0001);
    }

    // 4. setPayment/getPayment round-trip
    @Test
    void testSetAndGetPayment() {
        Booking b = new Booking("BK4", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);

        Payment payment = new Payment(150.0) {
            @Override
            public void pay() { /* no-op for test */ }
            @Override
            public void refund() { /* no-op for test */ }
        };

        b.setPayment(payment);
        assertEquals(payment, b.getPayment());
    }

    // 5. getDescription with a real room
    @Test
    void testGetDescriptionWithRoom() {
        Booking b = new Booking("BK5", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);
        assertEquals("Standard Room Booking (101)", b.getDescription());
    }

    // 6. getDescription with a null room
    @Test
    void testGetDescriptionWithNullRoom() {
        Booking b = new Booking("BK6", null, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);
        assertEquals("Standard Room Booking (N/A)", b.getDescription());
    }

    // ---------- cancelBooking ----------

    // 7. Cancel succeeds when now is before startTime
    @Test
    void testCancelBookingBeforeStartSucceeds() {
        Booking b = new Booking("BK7", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);
        assertTrue(b.cancelBooking());
        assertEquals("CANCELLED", b.getStatus());
    }

    // 8. Cancel fails when now is after startTime
    @Test
    void testCancelBookingAfterStartFails() {
        Booking b = new Booking("BK8", room, LocalDateTime.now().minusHours(1),
                LocalDateTime.now().plusHours(1), "BOOKED", 20.0, 150.0, null, user);
        assertFalse(b.cancelBooking());
        assertEquals("BOOKED", b.getStatus());
    }

    // ---------- editBooking ----------

    // 9. Edit succeeds - room available and booking hasn't started
    @Test
    void testEditBookingSucceeds() {
        Booking b = new Booking("BK9", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 20.0, 150.0, null, user);
        LocalDateTime newStart = LocalDateTime.now().plusHours(3);
        LocalDateTime newEnd = LocalDateTime.now().plusHours(4);

        assertTrue(b.editBooking(newStart, newEnd));
        assertEquals(newStart, b.getStartTime());
        assertEquals(newEnd, b.getEndTime());
    }

    // 10. Edit fails when the room isn't available (conflicting active booking)
    @Test
    void testEditBookingFailsWhenRoomUnavailable() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(2);

        Booking conflicting = new Booking("BKX", room, start, end, "BOOKED", 20.0, 100.0, null, user);
        AppData.bookings.add(conflicting);

        Booking b = new Booking("BK10", room, LocalDateTime.now().plusHours(5),
                LocalDateTime.now().plusHours(6), "BOOKED", 20.0, 150.0, null, user);

        // try to edit into the same overlapping window as `conflicting`
        assertFalse(b.editBooking(start, end));
    }

    // 11. Edit fails when booking has already started, even if room is available
    @Test
    void testEditBookingFailsAfterStart() {
        Booking b = new Booking("BK11", room, LocalDateTime.now().minusHours(1),
                LocalDateTime.now().plusHours(1), "BOOKED", 20.0, 150.0, null, user);
        assertFalse(b.editBooking(LocalDateTime.now().plusHours(3), LocalDateTime.now().plusHours(4)));
    }

    // ---------- extendBooking ----------

    // 12. Extend succeeds - increases total and updates endTime
    @Test
    void testExtendBookingSucceeds() {
        LocalDateTime end = LocalDateTime.now().plusHours(1);
        Booking b = new Booking("BK12", room, LocalDateTime.now().minusMinutes(30),
                end, "BOOKED", 10.0, 100.0, null, user);

        LocalDateTime newEnd = end.plusHours(2);
        assertTrue(b.extendBooking(newEnd));
        assertEquals(newEnd, b.getEndTime());
        assertEquals(120.0, b.getTotal(), 0.0001); // 100 + (2 hrs * 10 deposit/hr)
    }

    // 13. Extend fails when booking has already ended
    @Test
    void testExtendBookingFailsWhenAlreadyEnded() {
        Booking b = new Booking("BK13", room, LocalDateTime.now().minusHours(3),
                LocalDateTime.now().minusHours(1), "BOOKED", 10.0, 100.0, null, user);
        assertFalse(b.extendBooking(LocalDateTime.now().plusHours(1)));
    }

    // 14. Extend fails when newEnd is not after current endTime
    @Test
    void testExtendBookingFailsWhenNewEndNotAfter() {
        LocalDateTime end = LocalDateTime.now().plusHours(1);
        Booking b = new Booking("BK14", room, LocalDateTime.now().minusMinutes(30),
                end, "BOOKED", 10.0, 100.0, null, user);
        assertFalse(b.extendBooking(end.minusMinutes(10)));
    }

    // 15. Extend fails when another booking conflicts with the new window
    @Test
    void testExtendBookingFailsWithConflict() {
        LocalDateTime end = LocalDateTime.now().plusHours(1);
        Booking b = new Booking("BK15", room, LocalDateTime.now().minusMinutes(30),
                end, "BOOKED", 10.0, 100.0, null, user);
        AppData.bookings.add(b);

        Booking conflicting = new Booking("BKY", room, end.plusMinutes(10),
                end.plusHours(3), "BOOKED", 10.0, 100.0, null, user);
        AppData.bookings.add(conflicting);

        assertFalse(b.extendBooking(end.plusHours(2)));
    }

    // ---------- checkIn ----------

    // 16. CheckIn succeeds within the valid window
    @Test
    void testCheckInSucceeds() {
        Booking b = new Booking("BK16", room, LocalDateTime.now().minusMinutes(5),
                LocalDateTime.now().plusHours(1), "BOOKED", 10.0, 100.0, null, user);
        assertTrue(b.checkIn(new Badge("B1")));
        assertEquals("IN USE", b.getStatus());
        assertNotNull(b.getCheckInTime());
    }

    // 17. CheckIn fails if already checked in
    @Test
    void testCheckInFailsIfAlreadyCheckedIn() {
        LocalDateTime now = LocalDateTime.now();
        Booking b = new Booking("BK17", room, now.minusMinutes(5),
                now.plusHours(1), "IN USE", 10.0, 100.0, now, user);
        assertFalse(b.checkIn(new Badge("B2")));
    }

    // 18. CheckIn fails before the booking starts
    @Test
    void testCheckInFailsBeforeStart() {
        Booking b = new Booking("BK18", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 10.0, 100.0, null, user);
        assertFalse(b.checkIn(new Badge("B3")));
    }

    // 19. CheckIn fails more than 30 minutes after start
    @Test
    void testCheckInFailsAfterGracePeriod() {
        Booking b = new Booking("BK19", room, LocalDateTime.now().minusMinutes(45),
                LocalDateTime.now().plusHours(1), "BOOKED", 10.0, 100.0, null, user);
        assertFalse(b.checkIn(new Badge("B4")));
    }

    // ---------- depositBack ----------

    // 20. depositBack false when never checked in
    @Test
    void testDepositBackFalseWhenNotCheckedIn() {
        Booking b = new Booking("BK20", room, LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(2), "BOOKED", 10.0, 100.0, null, user);
        assertFalse(b.depositBack());
    }

    // 21. depositBack true when checked in within the grace period
    @Test
    void testDepositBackTrueWhenCheckedInOnTime() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(5);
        Booking b = new Booking("BK21", room, start,
                start.plusHours(1), "IN USE", 10.0, 100.0, start, user);
        assertTrue(b.depositBack());
    }

    // 22. depositBack false when checkInTime is after the grace period
    // (unreachable via the public checkIn() API, so we set it directly via
    // reflection purely to exercise this branch for coverage purposes)
    @Test
    void testDepositBackFalseWhenCheckedInLate() throws Exception {
        LocalDateTime start = LocalDateTime.now().minusHours(2);
        Booking b = new Booking("BK22", room, start,
                start.plusHours(3), "IN USE", 10.0, 100.0, null, user);

        Field checkInField = Booking.class.getDeclaredField("checkInTime");
        checkInField.setAccessible(true);
        checkInField.set(b, start.plusHours(1)); // well past start + 30 mins

        assertFalse(b.depositBack());
    }

    // ---------- static roomAvailable ----------

    // 23. Room available when there are no bookings at all
    @Test
    void testRoomAvailableTrueWhenNoBookings() {
        assertTrue(Booking.roomAvailable(room, LocalDateTime.now(), LocalDateTime.now().plusHours(1)));
    }

    // 24. Room unavailable when an active overlapping booking exists
    @Test
    void testRoomAvailableFalseWithOverlap() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(2);
        AppData.bookings.add(new Booking("BKZ", room, start, end, "BOOKED", 10.0, 100.0, null, user));

        assertFalse(Booking.roomAvailable(room, start.plusMinutes(30), end.plusMinutes(30)));
    }

    // 25. Cancelled bookings are ignored when checking availability
    @Test
    void testRoomAvailableIgnoresCancelledBookings() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(2);
        AppData.bookings.add(new Booking("BKC", room, start, end, "CANCELLED", 10.0, 100.0, null, user));

        assertTrue(Booking.roomAvailable(room, start, end));
    }

    // 26. A different room with overlapping times doesn't block availability
    @Test
    void testRoomAvailableDifferentRoomNoConflict() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = LocalDateTime.now().plusHours(2);
        Room otherRoom = new Room("999", "Building Z", 4, "AVAILABLE");
        AppData.bookings.add(new Booking("BKD", otherRoom, start, end, "BOOKED", 10.0, 100.0, null, user));

        assertTrue(Booking.roomAvailable(room, start, end));
    }
}