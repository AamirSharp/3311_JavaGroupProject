package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private Student student;

	@BeforeEach
	void setup() {
		student = new Student("100", "student@yorku.ca", "pass123", true, 12345678L);
	}

	@Test
	void testHourlyRate() {
		assertEquals(20.0, student.getHourlyRate());
	}

	@Test
	void testRoleName() {
		assertEquals("Student", student.getRoleName());
	}

	@Test
	void testStudentId() {
		assertEquals("100", student.getId());
	}

	@Test
	void testStudentEmail() {
		assertEquals("student@yorku.ca", student.getEmail());
	}

	@Test
	void testStudentPassword() {
		assertEquals("pass123", student.getPassword());
	}

	@Test
	void testStudentIsVerified() {
		assertTrue(student.isVerified());
	}

	@Test
	void testLoginWorks() {
		assertTrue(student.login("pass123"));
	}

	@Test
	void testLoginWrongPassword() {
		assertFalse(student.login("wrong"));
	}

	@Test
	void testUnverifiedStudent() {
		Student student2 = new Student("101", "student2@yorku.ca", "hello123", false, 22222222L);
		assertFalse(student2.isVerified());
	}

	@Test
	void testSecondConstructor() {
		Student student2 = new Student("200", "second@yorku.ca", "password", 33333333L);

		assertEquals("200", student2.getId());
		assertEquals("second@yorku.ca", student2.getEmail());
		assertFalse(student2.isVerified());
	}
}