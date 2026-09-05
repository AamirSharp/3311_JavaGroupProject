package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AIStaffBookingDecoratorTest {

    private Booking createBooking(int hours) {
        LocalDateTime start = LocalDateTime.of(2026, 8, 10, 10, 0);
        LocalDateTime end = start.plusHours(hours);

        return new Booking(
                "B001",
                null,
                start,
                end,
                "BOOKED",
                10.0,
                100.0,
                null,
                null
        );
    }

    // 1. Staff booking should charge $40 for one hour
    @Test
    public void testOneHourStaffBooking() {
        Booking booking = createBooking(1);
        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(40.0, decorator.cost(), 0.001);
    }

    // 2. Staff booking should correctly calculate a two hour booking
    @Test
    public void testTwoHourStaffBooking() {
        Booking booking = createBooking(2);
        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(80.0, decorator.cost(), 0.001);
    }

    // 3. Staff booking should correctly calculate a longer booking
    @Test
    public void testFiveHourStaffBooking() {
        Booking booking = createBooking(5);
        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(200.0, decorator.cost(), 0.001);
        assertTrue(decorator.cost() > 0);
    }

    // 4. Description should contain the staff rate
    @Test
    public void testDescriptionContainsStaffRate() {
        StaffBookingDecorator decorator =
                new StaffBookingDecorator(createBooking(1));

        assertTrue(
                decorator.getDescription().contains("[Staff Rate: $40/hr]")
        );
    }

    // 5. Decorator should keep the original booking description
    @Test
    public void testOriginalDescriptionIsPreserved() {
        StaffBookingDecorator decorator =
                new StaffBookingDecorator(createBooking(1));

        assertTrue(
                decorator.getDescription().contains("Standard Room Booking")
        );
    }

    // 6. Half hour bookings should use half of the hourly rate
    @Test
    public void testThirtyMinuteBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 10, 10, 0);

        Booking booking = new Booking(
                "B002", null, start, start.plusMinutes(30),
                "BOOKED", 10.0, 20.0, null, null
        );

        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(20.0, decorator.cost(), 0.001);
    }

    // 7. Ninety minutes should be charged as 1.5 hours
    @Test
    public void testNinetyMinuteBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 10, 10, 0);

        Booking booking = new Booking(
                "B003", null, start, start.plusMinutes(90),
                "BOOKED", 10.0, 60.0, null, null
        );

        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(60.0, decorator.cost(), 0.001);
    }

    // 8. The decorator should preserve the original booking ID
    @Test
    public void testBookingIdIsPreserved() {
        Booking booking = createBooking(2);
        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals("B001", decorator.getBookingId());
    }

    // 9. The decorator should preserve booking times
    @Test
    public void testBookingTimesArePreserved() {
        Booking booking = createBooking(3);
        StaffBookingDecorator decorator = new StaffBookingDecorator(booking);

        assertEquals(booking.getStartTime(), decorator.getStartTime());
        assertEquals(booking.getEndTime(), decorator.getEndTime());
    }

    // 10. Staff rate should be consistent for different booking durations
    @Test
    public void testStaffRateConsistency() {
        StaffBookingDecorator oneHour =
                new StaffBookingDecorator(createBooking(1));

        StaffBookingDecorator threeHours =
                new StaffBookingDecorator(createBooking(3));

        assertEquals(40.0, oneHour.cost(), 0.001);
        assertEquals(120.0, threeHours.cost(), 0.001);
        assertEquals(oneHour.cost() * 3, threeHours.cost(), 0.001);
    }
}