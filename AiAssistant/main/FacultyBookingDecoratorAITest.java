package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FacultyBookingDecoratorAITest {

    private Booking baseBooking;
    private FacultyBookingDecorator decorator;
    private LocalDateTime start;
    private LocalDateTime end;

    @BeforeEach
    void setUp() {
        Room room = new Room("R301", "Life Sciences", 40, "AVAILABLE");
        Faculty faculty = new Faculty("F-1", "prof@yorku.ca", "pass", true, 1001L);
        start = LocalDateTime.of(2026, 9, 15, 12, 0);
        end = start.plusHours(2); // 2 hours

        baseBooking = new Booking("B-300", room, start, end, "BOOKED", 30.0, 60.0, null, faculty);
        decorator = new FacultyBookingDecorator(baseBooking);
    }

    @Test
    void testCostForTwoHours() {
        assertEquals(60.0, decorator.cost(), 0.001);
    }

    @Test
    void testCostForOneHour() {
        Room room = new Room("R302", "Life Sciences", 40, "AVAILABLE");
        Faculty faculty = new Faculty("F-2", "prof2@yorku.ca", "pass", true, 1002L);
        Booking shortBooking = new Booking("B-301", room, start, start.plusHours(1), "BOOKED", 30.0, 30.0, null, faculty);

        FacultyBookingDecorator dec = new FacultyBookingDecorator(shortBooking);
        assertEquals(30.0, dec.cost(), 0.001);
    }

    @Test
    void testCostForNinetyMinutes() {
        Room room = new Room("R303", "Life Sciences", 40, "AVAILABLE");
        Faculty faculty = new Faculty("F-3", "prof3@yorku.ca", "pass", true, 1003L);
        Booking partialBooking = new Booking("B-302", room, start, start.plusMinutes(90), "BOOKED", 30.0, 45.0, null, faculty);

        FacultyBookingDecorator dec = new FacultyBookingDecorator(partialBooking);
        assertEquals(45.0, dec.cost(), 0.001); // 1.5 hrs * $30 = $45
    }

    @Test
    void testGetDescriptionAppendsFacultyTag() {
        String desc = decorator.getDescription();
        assertTrue(desc.contains("Standard Room Booking (R301)"));
        assertTrue(desc.endsWith("[Faculty Rate: $30/hr]"));
    }

    @Test
    void testDelegatedGettersMatchBaseBooking() {
        assertEquals("B-300", decorator.getBookingId());
        assertEquals(start, decorator.getStartTime());
        assertEquals(end, decorator.getEndTime());
        assertEquals("BOOKED", decorator.getStatus());
    }

    @Test
    void testGetRoom() {
        assertNotNull(decorator.getRoom());
        assertEquals("R301", decorator.getRoom().getRoomNumber());
    }

    @Test
    void testGetBookedBy() {
        assertNotNull(decorator.getBookedBy());
        assertEquals("F-1", decorator.getBookedBy().getId());
    }

    @Test
    void testChainedDecoratorCost() {
        FacultyBookingDecorator chainedDecorator = new FacultyBookingDecorator(decorator);
        assertEquals(60.0, chainedDecorator.cost(), 0.001);
    }

    @Test
    void testChainedDecoratorDescription() {
        FacultyBookingDecorator chainedDecorator = new FacultyBookingDecorator(decorator);
        assertTrue(chainedDecorator.getDescription().contains("[Faculty Rate: $30/hr]"));
    }

    @Test
    void testZeroDurationCost() {
        Room room = new Room("R304", "Life Sciences", 40, "AVAILABLE");
        Faculty faculty = new Faculty("F-4", "prof4@yorku.ca", "pass", true, 1004L);
        Booking zeroBooking = new Booking("B-303", room, start, start, "BOOKED", 30.0, 0.0, null, faculty);

        FacultyBookingDecorator dec = new FacultyBookingDecorator(zeroBooking);
        assertEquals(0.0, dec.cost(), 0.001);
    }
}