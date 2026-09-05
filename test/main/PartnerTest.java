package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PartnerTest {

    private Partner verifiedPartner;
    private Partner defaultPartner;

    @BeforeEach
    void setUp() {
        verifiedPartner = new Partner("P100", "partner@corp.com", "partnerPass", true, 776655L);
        defaultPartner = new Partner("P101", "partner2@corp.com", "pass456", 889900L);
    }

    @Test
    void testFullConstructor() {
        assertEquals("P100", verifiedPartner.getId());
        assertEquals("partner@corp.com", verifiedPartner.getEmail());
        assertEquals("partnerPass", verifiedPartner.getPassword());
        assertTrue(verifiedPartner.isVerified());
    }

    @Test
    void testOverloadedConstructorDefaultsUnverified() {
        assertEquals("P101", defaultPartner.getId());
        assertEquals("partner2@corp.com", defaultPartner.getEmail());
        assertEquals("pass456", defaultPartner.getPassword());
        assertFalse(defaultPartner.isVerified());
    }

    @Test
    void testGetHourlyRate() {
        assertEquals(50.0, verifiedPartner.getHourlyRate(), 0.001);
    }

    @Test
    void testGetRoleName() {
        assertEquals("Partner", verifiedPartner.getRoleName());
    }

    @Test
    void testLoginSuccess() {
        assertTrue(verifiedPartner.login("partnerPass"));
    }

    @Test
    void testLoginFailure() {
        assertFalse(verifiedPartner.login("wrong"));
    }

    @Test
    void testBookingUnverifiedThrowsException() {
        Room room = new Room("R201", "Lassonde", 15, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        assertThrows(IllegalStateException.class, () -> {
            defaultPartner.booking(room, start, end);
        });
    }

    @Test
    void testBookingSuccessfulAtPartnerRate() {
        Room room = new Room("R202", "Lassonde", 15, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2); // 2 hours

        Booking b = verifiedPartner.booking(room, start, end);
        assertNotNull(b);
        assertEquals(100.0, b.getTotal(), 0.001); // 2 hours * 50.0 = 100.0
    }

    @Test
    void testPolymorphicUserReference() {
        User u = new Partner("P102", "user@corp.com", "pass", true, 333L);
        assertEquals("Partner", u.getRoleName());
        assertEquals(50.0, u.getHourlyRate(), 0.001);
    }

    @Test
    void testNullPartnerNumber() {
        Partner p = new Partner("P103", "test@corp.com", "pass", null);
        assertNotNull(p);
        assertEquals("Partner", p.getRoleName());
    }
}