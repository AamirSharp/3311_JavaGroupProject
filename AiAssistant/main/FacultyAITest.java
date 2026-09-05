package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FacultyAITest {

    private Faculty verifiedFaculty;
    private Faculty unverifiedFaculty;

    @BeforeEach
    void setUp() {
        AppData.bookings.clear(); // Clear static memory before each run
        verifiedFaculty = new Faculty("F-100", "faculty1@yorku.ca", "secure123", true, 998877L);
        unverifiedFaculty = new Faculty("F-101", "faculty2@yorku.ca", "pass456", 112233L);
    }

    @Test
    void testFullConstructorInitialization() {
        assertEquals("F-100", verifiedFaculty.getId());
        assertEquals("faculty1@yorku.ca", verifiedFaculty.getEmail());
        assertEquals("secure123", verifiedFaculty.getPassword());
        assertTrue(verifiedFaculty.isVerified());
    }

    @Test
    void testOverloadedConstructorDefaultsUnverified() {
        assertEquals("F-101", unverifiedFaculty.getId());
        assertEquals("faculty2@yorku.ca", unverifiedFaculty.getEmail());
        assertEquals("pass456", unverifiedFaculty.getPassword());
        assertFalse(unverifiedFaculty.isVerified());
    }

    @Test
    void testGetHourlyRate() {
        assertEquals(30.0, verifiedFaculty.getHourlyRate(), 0.001);
    }

    @Test
    void testGetRoleName() {
        assertEquals("Faculty", verifiedFaculty.getRoleName());
    }

    @Test
    void testLoginSuccessAndFailure() {
        assertTrue(verifiedFaculty.login("secure123"));
        assertFalse(verifiedFaculty.login("wrongpass"));
    }

    @Test
    void testBookingWhenUnverifiedThrowsException() {
        Room room = new Room("R201", "Lassonde", 20, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusDays(1).withHour(10).withMinute(0);
        LocalDateTime end = start.plusHours(2);

        assertThrows(IllegalStateException.class, () -> {
            unverifiedFaculty.booking(room, start, end);
        });
    }

    @Test
    void testBookingSuccessfulAtFacultyRate() {
        Room room = new Room("R202", "Lassonde", 20, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusDays(2).withHour(10).withMinute(0);
        LocalDateTime end = start.plusHours(3); // 3 hours

        Booking booking = verifiedFaculty.booking(room, start, end);
        assertNotNull(booking);
        assertEquals(90.0, booking.getTotal(), 0.001); // 3 hrs * $30/hr = $90
    }

    @Test
    void testNullEmploymentNumberHandled() {
        Faculty facultyNullEmp = new Faculty("F-102", "null@yorku.ca", "pass", true, null);
        assertNotNull(facultyNullEmp);
        assertEquals("Faculty", facultyNullEmp.getRoleName());
    }

    @Test
    void testPolymorphicUserType() {
        User userRef = new Faculty("F-103", "poly@yorku.ca", "pass", true, 555444L);
        assertEquals("Faculty", userRef.getRoleName());
        assertEquals(30.0, userRef.getHourlyRate(), 0.001);
    }

    @Test
    void testSetVerifiedUpdatesStatus() {
        unverifiedFaculty.setVerified(true);
        assertTrue(unverifiedFaculty.isVerified());
    }
}