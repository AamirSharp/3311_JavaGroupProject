package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AIStudentBookingDecoratorTest {

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
                50.0,
                null,
                null
        );
    }

    // 1. Student booking should cost $20 for one hour
    @Test
    public void testOneHourStudentBooking() {
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(createBooking(1));

        assertEquals(20.0, decorator.cost(), 0.001);
    }

    // 2. Two hour booking should cost $40
    @Test
    public void testTwoHourStudentBooking() {
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(createBooking(2));

        assertEquals(40.0, decorator.cost(), 0.001);
    }

    // 3. Longer bookings should continue using the student rate
    @Test
    public void testFiveHourStudentBooking() {
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(createBooking(5));

        assertEquals(100.0, decorator.cost(), 0.001);
        assertTrue(decorator.cost() > 0);
    }

    // 4. Description should include the student rate
    @Test
    public void testDescriptionContainsStudentRate() {
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(createBooking(1));

        assertTrue(
                decorator.getDescription().contains("[Student Rate: $20/hr]")
        );
    }

    // 5. Original description should still exist after decoration
    @Test
    public void testOriginalDescriptionIsPreserved() {
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(createBooking(1));

        assertTrue(
                decorator.getDescription().contains("Standard Room Booking")
        );
    }

    // 6. Half hour bookings should cost $10
    @Test
    public void testThirtyMinuteStudentBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 10, 10, 0);

        Booking booking = new Booking(
                "B002", null, start, start.plusMinutes(30),
                "BOOKED", 10.0, 10.0, null, null
        );

        StudentBookingDecorator decorator =
                new StudentBookingDecorator(booking);

        assertEquals(10.0, decorator.cost(), 0.001);
    }

    // 7. Ninety minute booking should cost $30
    @Test
    public void testNinetyMinuteStudentBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 8, 10, 10, 0);

        Booking booking = new Booking(
                "B003", null, start, start.plusMinutes(90),
                "BOOKED", 10.0, 30.0, null, null
        );

        StudentBookingDecorator decorator =
                new StudentBookingDecorator(booking);

        assertEquals(30.0, decorator.cost(), 0.001);
    }

    // 8. Decorator should preserve the booking ID
    @Test
    public void testBookingIdIsPreserved() {
        Booking booking = createBooking(2);
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(booking);

        assertEquals("B001", decorator.getBookingId());
    }

    // 9. Decorator should preserve start and end times
    @Test
    public void testBookingTimesArePreserved() {
        Booking booking = createBooking(3);
        StudentBookingDecorator decorator =
                new StudentBookingDecorator(booking);

        assertEquals(booking.getStartTime(), decorator.getStartTime());
        assertEquals(booking.getEndTime(), decorator.getEndTime());
    }

    // 10. Student pricing should scale consistently with duration
    @Test
    public void testStudentRateConsistency() {
        StudentBookingDecorator oneHour =
                new StudentBookingDecorator(createBooking(1));

        StudentBookingDecorator fourHours =
                new StudentBookingDecorator(createBooking(4));

        assertEquals(20.0, oneHour.cost(), 0.001);
        assertEquals(80.0, fourHours.cost(), 0.001);
        assertEquals(oneHour.cost() * 4, fourHours.cost(), 0.001);
    }
}