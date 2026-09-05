package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class UserFactoryTest {
	@Test
	void testStudentAcc() {
		User user = UserFactory.createUser("STUDENT", "1", "student@yorku.ca", "csEECS3311@", true, 111111111L);
		assertTrue(user instanceof Student);
		assertEquals("Student", user.getRoleName());
	}
	@Test
	void testFacultyAcc() {
		User user = UserFactory.createUser("FACULTY", "2", "faculty@yorku.ca", "csEECS3311@", true, 222222222L);
		assertTrue(user instanceof Faculty);
		assertEquals("Faculty", user.getRoleName());
	}
	@Test
	void testUserAccountWithUnknownType() {
		assertThrows(IllegalArgumentException.class, () -> {
			UserFactory.createUser("GUEST", "3", "guest@yorku.ca", "csEECS3311@", true, 333333333L);
		});
	}
	@Test
	void testReturnsCorrectType() {
		User user = UserFactory.createUser("STAFF", "4", "staff@yorku.ca", "csEECS3311@", true, 444444444L);
		assertTrue(user instanceof Staff);
		assertEquals("Staff", user.getRoleName());
	}
	@Test
	void testReturnPartnertype() {
		User user = UserFactory.createUser("PARTNER", "5", "partner@yorku.ca", "csEECS3311@", true, 555555555L);
		assertTrue(user instanceof Partner);
		assertEquals("Partner", user.getRoleName());
	}
	@Test
	void testsameEmail() {
		User user = UserFactory.createUser("STUDENT", "6", "checking@yorku.ca", "csEECS3311@", true, 666666666L);
		assertEquals("checking@yorku.ca", user.getEmail());
	}
	@Test
	void testCorrectId() {
		User user = UserFactory.createUser("STUDENT", "7", "id@yorku.ca", "csEECS3311@", true, 777777777L);
		assertEquals("7", user.getId());
	}
	@Test
	void testVerificationisFalse() {
		User user = UserFactory.createUser("STAFF", "8", "unverified@yorku.ca", "csEECS3311@", false, 888888888L);
		assertFalse(user.isVerified());
	}
	@Test
	void testDifferecthourlyRates() {
		User student = UserFactory.createUser("STUDENT", "9", "s@yorku.ca", "csEECS3311@", true, 999999999L);
		User faculty = UserFactory.createUser("FACULTY", "10", "f@yorku.ca", "csEECS3311@", true, 101010101L);
		assertNotEquals(student.getHourlyRate(), faculty.getHourlyRate());
	}
	@Test
	void testequalhourlyRates() {
		User student = UserFactory.createUser("STUDENT", "9", "s@yorku.ca", "csEECS3311@", true, 999999999L);
		User student2 = UserFactory.createUser("STUDENT", "9", "s@yorku.ca", "csEECS3311@", true, 999999999L);
		assertEquals(student.getHourlyRate(), student2.getHourlyRate());
	}

}
