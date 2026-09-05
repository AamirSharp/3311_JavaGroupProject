package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookingDecoratorTest {

    private Room room;
    private User user;
    private Booking booking;
    private BookingDecorator decorator;


   private static class TestBookingDecorator extends BookingDecorator {
        public TestBookingDecorator(Booking booking) {
            super(booking);
        }
    }

    //dummy user used only for testing since abstract class 
    private static class DummyUser extends User {
        public DummyUser() {
            super("u1", "test@test.com", "pass", true);
        }

        @Override
        public double getHourlyRate() {
            return 25.0;
        }

        @Override
        public String getRoleName() {
            return "Dummy";
        }
    }

    @BeforeEach
    void setUp() {
        room = new Room("101", "ACE", 40);
        user = new DummyUser();

        LocalDateTime start = LocalDateTime.of(2026, 8, 1, 10, 0);
        LocalDateTime end = LocalDateTime.of(2026, 8, 1, 12, 0);

        booking = new Booking(
                "B001",
                room,
                start,
                end,
                "BOOKED",
                20.0,
                100.0,
                null,
                user);

        decorator = new TestBookingDecorator(booking);
    }

    @Test
    void testBookingIdCopied() {
        assertEquals(booking.getBookingId(), decorator.getBookingId());
    }

    @Test
    void testRoomCopied() {
        assertEquals(booking.getRoom(), decorator.getRoom());
    }

    @Test
    void testStartTimeCopied() {
        assertEquals(booking.getStartTime(), decorator.getStartTime());
    }

    @Test
    void testEndTimeCopied() {
        assertEquals(booking.getEndTime(), decorator.getEndTime());
    }

    @Test
    void testStatusCopied() {
        assertEquals(booking.getStatus(), decorator.getStatus());
    }

    @Test
    void testDepositCopied() {
        assertEquals(booking.getDeposit(), decorator.getDeposit());
    }

    @Test
    void testTotalCopied() {
        assertEquals(booking.getTotal(), decorator.getTotal());
    }

    @Test
    void testBookedByCopied() {
        assertEquals(booking.getBookedBy(), decorator.getBookedBy());
    }

    @Test
    void testCostDelegatesToBooking() {
        assertEquals(booking.cost(), decorator.cost());
    }

    @Test
    void testDescriptionDelegatesToBooking() {
        assertEquals(booking.getDescription(), decorator.getDescription());
    }
}