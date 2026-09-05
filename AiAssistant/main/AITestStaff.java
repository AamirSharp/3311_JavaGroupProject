package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AITestStaff {

    private Staff staff;

    @BeforeEach
    void setUp() {
        staff = new Staff(
                "S001",
                "staff@yorku.ca",
                "password123",
                true,
                123456789L
        );
    }

    // 1. Verify that a verified staff account is initialized correctly
    @Test
    void testVerifiedStaffInitialization() {
        assertEquals("S001", staff.getId());
        assertEquals("staff@yorku.ca", staff.getEmail());
        assertEquals("password123", staff.getPassword());
        assertTrue(staff.isVerified());
    }

    // 2. Verify that the second constructor creates an unverified staff account
    @Test
    void testUnverifiedStaffInitialization() {
        Staff unverifiedStaff = new Staff(
                "S002",
                "newstaff@yorku.ca",
                "newpassword",
                222222222L
        );

        assertEquals("S002", unverifiedStaff.getId());
        assertEquals("newstaff@yorku.ca", unverifiedStaff.getEmail());
        assertFalse(unverifiedStaff.isVerified());
    }

    // 3. Staff should return the correct role and hourly booking rate
    @Test
    void testStaffRoleAndRate() {
        assertEquals("Staff", staff.getRoleName());
        assertEquals(40.0, staff.getHourlyRate(), 0.001);
        assertTrue(staff.getHourlyRate() > 0);
    }

    // 4. Login should only work when the exact password is provided
    @Test
    void testLoginAuthentication() {
        assertTrue(staff.login("password123"));
        assertFalse(staff.login("wrongpassword"));
        assertFalse(staff.login("Password123"));
    }

    // 5. An empty password should not authenticate the account
    @Test
    void testLoginWithEmptyPassword() {
        assertFalse(staff.login(""));
    }

    // 6. A password containing extra spaces should not be accepted
    @Test
    void testLoginWithExtraSpaces() {
        assertFalse(staff.login(" password123"));
        assertFalse(staff.login("password123 "));
    }

    // 7. Staff accounts should preserve their verification state
    @Test
    void testDifferentVerificationStates() {
        Staff verified = new Staff(
                "S003",
                "verified@yorku.ca",
                "pass1",
                true,
                333333333L
        );

        Staff unverified = new Staff(
                "S004",
                "unverified@yorku.ca",
                "pass2",
                false,
                444444444L
        );

        assertTrue(verified.isVerified());
        assertFalse(unverified.isVerified());
    }

    // 8. Two staff members should maintain independent account information
    @Test
    void testIndependentStaffObjects() {
        Staff otherStaff = new Staff(
                "S005",
                "other@yorku.ca",
                "otherpassword",
                false,
                555555555L
        );

        assertNotEquals(staff.getId(), otherStaff.getId());
        assertNotEquals(staff.getEmail(), otherStaff.getEmail());
        assertNotEquals(staff.getPassword(), otherStaff.getPassword());
        assertNotEquals(staff.isVerified(), otherStaff.isVerified());
    }

    // 9. A long password should still authenticate correctly
    @Test
    void testLongPassword() {
        String longPassword = "ThisIsAVeryLongStaffPassword123456789";

        Staff longPasswordStaff = new Staff(
                "S006",
                "longpass@yorku.ca",
                longPassword,
                true,
                666666666L
        );

        assertTrue(longPasswordStaff.login(longPassword));
        assertFalse(longPasswordStaff.login("ThisIsAVeryLongStaffPassword"));
    }

    // 10. Staff role and rate should remain the same for different staff accounts
    @Test
    void testRoleAndRateConsistencyAcrossStaff() {
        Staff anotherStaff = new Staff(
                "S007",
                "another@yorku.ca",
                "abc123",
                false,
                777777777L
        );

        assertEquals(staff.getRoleName(), anotherStaff.getRoleName());
        assertEquals(staff.getHourlyRate(), anotherStaff.getHourlyRate(), 0.001);
        assertEquals("Staff", anotherStaff.getRoleName());
        assertEquals(40.0, anotherStaff.getHourlyRate(), 0.001);
    }
}