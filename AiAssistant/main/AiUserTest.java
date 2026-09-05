package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AiUserTest {

    // Minimal concrete subclass purely for testing the abstract User class
    static class TestUser extends User {
        public TestUser(String id, String email, String password, boolean isVerified) {
            super(id, email, password, isVerified);
        }
        @Override
        public double getHourlyRate() {
            return 20.0;
        }
        @Override 
        public String getRoleName() {
            return "TestUser";
        }
        // expose protected setVerified for direct testing
        public void makeVerified(boolean b) {
            setVerified(b);
        }
    }

    private TestUser user;
    private Room room;

    @BeforeEach
    void setUp() {
        AppData.bookings = new ArrayList<>();
        user = new TestUser("u1", "test@example.com", "pass123", true);
        room = new Room("101", "Building A", 10, "AVAILABLE");
    }

    // 1. Constructor / getters
    @Test
    void testConstructorAndGetters() {
        assertEquals("u1", user.getId());
        assertEquals("test@example.com", user.getEmail());
        assertEquals("pass123", user.getPassword());
        assertTrue(user.isVerified());
    }

    // 2. isVerified false when constructed as unverified
    @Test
    void testIsVerifiedFalseWhenConstructedUnverified() {
        TestUser unverified = new TestUser("u2", "b@example.com", "pw", false);
        assertFalse(unverified.isVerified());
    }

    // 3. login with correct password returns true
    @Test
    void testLoginWithCorrectPassword() {
        assertTrue(user.login("pass123"));
    }

    // 4. login with incorrect password returns false
    @Test
    void testLoginWithIncorrectPassword() {
        assertFalse(user.login("wrongpass"));
    }

    // 5. logout doesn't throw (only prints)
    @Test
    void testLogoutDoesNotThrow() {
        assertDoesNotThrow(() -> user.logout());
    }
 
    // 6. getHourlyRate / getRoleName via concrete subclass
    @Test
    void testGetHourlyRateAndRoleName() {
        assertEquals(20.0, user.getHourlyRate(), 0.0001);
        assertEquals("TestUser", user.getRoleName());
    }

    // 7. setVerified (protected) toggles isVerified
    @Test
    void testSetVerifiedTogglesFlag() {
        user.makeVerified(false);
        assertFalse(user.isVerified());
        user.makeVerified(true);
        assertTrue(user.isVerified());
    }

    // ---------- booking() ----------

    // 8. booking() succeeds and returns a correctly populated Booking
    @Test
    void testBookingSucceeds() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2); // 2 hour booking

        Booking b = user.booking(room, start, end);

        assertNotNull(b);
        assertEquals(room, b.getRoom());
        assertEquals(start, b.getStartTime());
        assertEquals(end, b.getEndTime());
        assertEquals("BOOKED", b.getStatus());
        assertEquals(20.0, b.getDeposit(), 0.0001); // deposit = hourly rate
        assertEquals(40.0, b.getTotal(), 0.0001);   // rate = hourlyRate * 2 hrs
        assertEquals(user, b.getBookedBy());
        assertTrue(b.getBookingId().startsWith("101"));
    }

    // 9. booking() generates unique booking IDs across multiple calls
    @Test
    void testBookingGeneratesUniqueIds() {
        LocalDateTime start1 = LocalDateTime.now().plusHours(1);
        LocalDateTime end1 = start1.plusHours(1);
        Booking b1 = user.booking(room, start1, end1);
        AppData.bookings.add(b1);

        Room room2 = new Room("102", "Building B", 5, "AVAILABLE");
        LocalDateTime start2 = LocalDateTime.now().plusHours(5);
        LocalDateTime end2 = start2.plusHours(1);
        Booking b2 = user.booking(room2, start2, end2);

        assertNotEquals(b1.getBookingId(), b2.getBookingId());
    }

    // 10. booking() throws when user is not verified
    @Test
    void testBookingThrowsWhenNotVerified() {
        user.makeVerified(false);
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> user.booking(room, start, end));
        assertEquals("Account is not verified", ex.getMessage());
    }

    // 11. booking() throws when room is not available
    @Test
    void testBookingThrowsWhenRoomNotAvailable() {
        Room disabledRoom = new Room("103", "Building C", 5, "DISABLED");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> user.booking(disabledRoom, start, end));
        assertEquals("The room you are looking for isn't available", ex.getMessage());
    }

    // 12. booking() throws when end time is not after start time
    @Test
    void testBookingThrowsWhenEndNotAfterStart() {
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.minusHours(1); // end before start

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> user.booking(room, start, end));
        assertEquals("tart time must be before end time", ex.getMessage());
    }

    // 13. booking() throws when end time equals start time
    @Test
    void testBookingThrowsWhenEndEqualsStart() {
        LocalDateTime start = LocalDateTime.now().plusHours(2);

        assertThrows(IllegalStateException.class,
                () -> user.booking(room, start, start));
    }

    // 14. booking() throws when room already has a conflicting booking
    @Test
    void testBookingThrowsWhenRoomAlreadyBookedForRange() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        // existing booking occupies an overlapping window
        Booking existing = new Booking("EXIST1", room, start, end, "BOOKED", 10.0, 40.0, null, user);
        AppData.bookings.add(existing);

        IllegalStateException ex = assertThrows(IllegalStateException.class,
                () -> user.booking(room, start.plusMinutes(30), end.plusMinutes(30)));
        assertEquals("This room is already booked for part of that time range", ex.getMessage());
    }
}