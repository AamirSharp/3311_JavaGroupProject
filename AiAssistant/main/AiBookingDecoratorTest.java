package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class AiBookingDecoratorTest {

    private Room room;
    private User user;
    private Booking booking;
    private BookingDecorator decorator;

    private static class TestBookingDecorator extends BookingDecorator {
        public TestBookingDecorator(Booking booking) {
            super(booking);
        }
    }

    private static class DummyUser extends User {

        public DummyUser() {
            super("u1", "test@test.com", "pass", true);
        }

        @Override
        public double getHourlyRate() {
            return 20.0;
        }

        @Override
        public String getRoleName() {
            return "Dummy";
        }
    }

    @BeforeEach
    void setup() {

        room = new Room("101", "Conference", 20);
        user = new DummyUser();

        booking = new Booking(
                "B1",
                room,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(4),
                "BOOKED",
                50,
                150,
                null,
                user);

        decorator = new TestBookingDecorator(booking);
    }

    @Test
    void testCostMatchesBooking() {
        assertEquals(booking.cost(), decorator.cost());
    }

    @Test
    void testDescriptionMatchesBooking() {
        assertEquals(booking.getDescription(), decorator.getDescription());
    }

    @Test
    void testBookingIdCopied() {
        assertEquals("B1", decorator.getBookingId());
    }

    @Test
    void testRoomCopied() {
        assertSame(room, decorator.getRoom());
    }

    @Test
    void testStatusCopied() {
        assertEquals("BOOKED", decorator.getStatus());
    }

    @Test
    void testBookedByCopied() {
        assertSame(user, decorator.getBookedBy());
    }

    @Test
    void testStartTimeCopied() {
        assertEquals(booking.getStartTime(), decorator.getStartTime());
    }

    @Test
    void testEndTimeCopied() {
        assertEquals(booking.getEndTime(), decorator.getEndTime());
    }
}