package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PartnerAITest {

    private Partner verifiedPartner;
    private Partner unverifiedPartner;

    @BeforeEach
    void setUp() {
        AppData.bookings.clear(); // Clear static memory before each run
        verifiedPartner = new Partner("P-100", "partner@corp.com", "partnerPass", true, 889900L);
        unverifiedPartner = new Partner("P-101", "partner2@corp.com", "pass789", 112233L);
    }

    @Test
    void testFullConstructorInitialization() {
        assertEquals("P-100", verifiedPartner.getId());
        assertEquals("partner@corp.com", verifiedPartner.getEmail());
        assertEquals("partnerPass", verifiedPartner.getPassword());
        assertTrue(verifiedPartner.isVerified());
    }

    @Test
    void testOverloadedConstructorDefaultsUnverified() {
        assertEquals("P-101", unverifiedPartner.getId());
        assertEquals("partner2@corp.com", unverifiedPartner.getEmail());
        assertEquals("pass789", unverifiedPartner.getPassword());
        assertFalse(unverifiedPartner.isVerified());
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
    void testLoginSuccessAndFailure() {
        assertTrue(verifiedPartner.login("partnerPass"));
        assertFalse(verifiedPartner.login("wrongPass"));
    }

    @Test
    void testBookingWhenUnverifiedThrowsException() {
        Room room = new Room("R401", "Bergeron", 15, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusDays(1).withHour(10).withMinute(0);
        LocalDateTime end = start.plusHours(2);

        assertThrows(IllegalStateException.class, () -> {
            unverifiedPartner.booking(room, start, end);
        });
    }

    @Test
    void testBookingSuccessfulAtPartnerRate() {
        Room room = new Room("R402", "Bergeron", 15, "AVAILABLE");
        LocalDateTime start = LocalDateTime.now().plusDays(2).withHour(10).withMinute(0);
        LocalDateTime end = start.plusHours(2); // 2 hours

        Booking booking = verifiedPartner.booking(room, start, end);
        assertNotNull(booking);
        assertEquals(100.0, booking.getTotal(), 0.001); // 2 hrs * $50/hr = $100
    }

    @Test
    void testNullPartnerNumberHandled() {
        Partner partnerNull = new Partner("P-102", "null@corp.com", "pass", true, null);
        assertNotNull(partnerNull);
        assertEquals("Partner", partnerNull.getRoleName());
    }

    @Test
    void testPolymorphicUserType() {
        User userRef = new Partner("P-103", "poly@corp.com", "pass", true, 444333L);
        assertEquals("Partner", userRef.getRoleName());
        assertEquals(50.0, userRef.getHourlyRate(), 0.001);
    }

    @Test
    void testSetVerifiedUpdatesStatus() {
        unverifiedPartner.setVerified(true);
        assertTrue(unverifiedPartner.isVerified());
    }
}