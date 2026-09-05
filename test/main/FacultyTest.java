package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    private Faculty verifiedFaculty;
    private Faculty defaultFaculty;

    @BeforeEach
    void setUp() {
        verifiedFaculty = new Faculty("F100", "prof@yorku.ca", "pass123", true, 998877L);
        defaultFaculty = new Faculty("F101", "prof2@yorku.ca", "secret", 112233L);
    }

    @Test
    void testFullConstructor() {
        assertEquals("F100", verifiedFaculty.getId());
        assertEquals("prof@yorku.ca", verifiedFaculty.getEmail());
        assertEquals("pass123", verifiedFaculty.getPassword());
        assertTrue(verifiedFaculty.isVerified());
    }

    @Test
    void testOverloadedConstructorDefaultsUnverified() {
        assertEquals("F101", defaultFaculty.getId());
        assertEquals("prof2@yorku.ca", defaultFaculty.getEmail());
        assertEquals("secret", defaultFaculty.getPassword());
        assertFalse(defaultFaculty.isVerified());
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
    void testLoginSuccess() {
        assertTrue(verifiedFaculty.login("pass123"));
    }

    @Test
    void testLoginFailure() {
        assertFalse(verifiedFaculty.login("wrongpass"));
    }

    @Test
    void testBookingUnverifiedThrowsException() {
        Room room = new Room("101", "Bergeron", 20, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        assertThrows(IllegalStateException.class, () -> {
            defaultFaculty.booking(room, start, end);
        });
    }

    @Test
    void testBookingSuccessful() {
        AppData.bookings.clear(); // Ensure no leftover bookings interfere
        
        Room room = new Room("R_TEST_1", "Bergeron", 20, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusDays(10).withHour(10).withMinute(0);
        LocalDateTime end = start.plusHours(2); // 2 hours

        Booking b = verifiedFaculty.booking(room, start, end);
        assertNotNull(b);
        assertEquals(60.0, b.getTotal(), 0.001); // 2 hrs * $30/hr = $60
    }

    @Test
    void testPolymorphicUserReference() {
        User u = new Faculty("F102", "user@yorku.ca", "pass", true, 555L);
        assertEquals("Faculty", u.getRoleName());
        assertEquals(30.0, u.getHourlyRate(), 0.001);
    }

    @Test
    void testNullEmploymentNumber() {
        Faculty f = new Faculty("F103", "test@yorku.ca", "pass", null);
        assertNotNull(f);
        assertEquals("Faculty", f.getRoleName());
    }
}