package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class StaffTest {
	private Staff staff;

	@BeforeEach
	void setup() {
		staff = new Staff("001", "staff@yorku.ca", "Password123", true, 12345678L);
	}

	@Test
	void testHourlyRate() {
		assertEquals(40.0, staff.getHourlyRate());
	}

	@Test
	void testRoleName() {
		assertEquals("Staff", staff.getRoleName());
	}

	@Test
	void testGetId() {
		assertEquals("001", staff.getId());
	}

	@Test
	void testGetEmail() {
		assertEquals("staff@yorku.ca", staff.getEmail());
	}

	@Test
	void testGetPassword() {
		assertEquals("Password123", staff.getPassword());
	}

	@Test
	void testVerifiedStaff() {
		assertTrue(staff.isVerified());
	}

	@Test
	void testCorrectLogin() {
		assertTrue(staff.login("Password123"));
	}

	@Test
	void testWrongLogin() {
		assertFalse(staff.login("wrongpassword"));
	}

	@Test
	void testSecondConstructor() {
		Staff staff2 = new Staff("002", "staff2@yorku.ca", "abc123", 87654321L);
		assertFalse(staff2.isVerified());
		assertEquals("Staff", staff2.getRoleName());
	}

	@Test
	void testDifferentStaff() {
		Staff staff2 = new Staff("003", "another@yorku.ca", "hello123", true, 11111111L);
		assertNotEquals(staff.getId(), staff2.getId());
		assertNotEquals(staff.getEmail(), staff2.getEmail());
	}
}