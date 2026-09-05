package main;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FacultyBookingDecoratorTest {

    private Booking baseBooking;
    private FacultyBookingDecorator facultyDecorator;
    private LocalDateTime start;
    private LocalDateTime end;

    @BeforeEach
    void setUp() {
        Room room = new Room("R101", "Lassonde", 30, "AVAILABLE");
        Faculty faculty = new Faculty("F1", "prof@yorku.ca", "pass", true, 1001L);
        start = LocalDateTime.of(2026, 9, 10, 10, 0);
        end = start.plusHours(2); // 2 hours

        baseBooking = new Booking("B100", room, start, end, "BOOKED", 30.0, 60.0, null, faculty);
        facultyDecorator = new FacultyBookingDecorator(baseBooking);
    }

    @Test
    void testCostForTwoHours() {
        // 2 hours * $30/hr = $60.0
        assertEquals(60.0, facultyDecorator.cost(), 0.001);
    }

    @Test
    void testCostForOneHour() {
        Room room = new Room("R102", "Lassonde", 30, "AVAILABLE");
        Faculty faculty = new Faculty("F2", "prof2@yorku.ca", "pass", true, 1002L);
        Booking shortBooking = new Booking("B101", room, start, start.plusHours(1), "BOOKED", 30.0, 30.0, null, faculty);
        
        FacultyBookingDecorator dec = new FacultyBookingDecorator(shortBooking);
        assertEquals(30.0, dec.cost(), 0.001);
    }

    @Test
    void testCostForNinetyMinutes() {
        Room room = new Room("R103", "Lassonde", 30, "AVAILABLE");
        Faculty faculty = new Faculty("F3", "prof3@yorku.ca", "pass", true, 1003L);
        Booking partialBooking = new Booking("B102", room, start, start.plusMinutes(90), "BOOKED", 30.0, 45.0, null, faculty);
        
        FacultyBookingDecorator dec = new FacultyBookingDecorator(partialBooking);
        assertEquals(45.0, dec.cost(), 0.001); // 1.5 hrs * 30 = 45.0
    }

    @Test
    void testGetDescriptionAppendsFacultyRate() {
        String desc = facultyDecorator.getDescription();
        assertTrue(desc.contains("Standard Room Booking (R101)"));
        assertTrue(desc.endsWith("[Faculty Rate: $30/hr]"));
    }

    @Test
    void testDelegatedGetters() {
        assertEquals("B100", facultyDecorator.getBookingId());
        assertEquals(start, facultyDecorator.getStartTime());
        assertEquals(end, facultyDecorator.getEndTime());
        assertEquals("BOOKED", facultyDecorator.getStatus());
    }

    @Test
    void testGetRoom() {
        assertNotNull(facultyDecorator.getRoom());
        assertEquals("R101", facultyDecorator.getRoom().getRoomNumber());
    }

    @Test
    void testGetBookedBy() {
        assertNotNull(facultyDecorator.getBookedBy());
        assertEquals("F1", facultyDecorator.getBookedBy().getId());
    }

    @Test
    void testChainedDecoratorCost() {
        FacultyBookingDecorator doubleDecorated = new FacultyBookingDecorator(facultyDecorator);
        assertEquals(60.0, doubleDecorated.cost(), 0.001);
    }

    @Test
    void testChainedDecoratorDescription() {
        FacultyBookingDecorator doubleDecorated = new FacultyBookingDecorator(facultyDecorator);
        assertTrue(doubleDecorated.getDescription().contains("[Faculty Rate: $30/hr]"));
    }

    @Test
    void testZeroDurationCost() {
        Room room = new Room("R104", "Lassonde", 30, "AVAILABLE");
        Faculty faculty = new Faculty("F4", "prof4@yorku.ca", "pass", true, 1004L);
        Booking zeroBooking = new Booking("B103", room, start, start, "BOOKED", 30.0, 0.0, null, faculty);
        
        FacultyBookingDecorator dec = new FacultyBookingDecorator(zeroBooking);
        assertEquals(0.0, dec.cost(), 0.001);
    }
}