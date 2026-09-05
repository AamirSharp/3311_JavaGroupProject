package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AIStudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student(
                "ST001",
                "student@yorku.ca",
                "studentpass",
                true,
                123456789L
        );
    }

    // 1. Verify that a verified student is initialized correctly
    @Test
    void testVerifiedStudentInitialization() {
        assertEquals("ST001", student.getId());
        assertEquals("student@yorku.ca", student.getEmail());
        assertEquals("studentpass", student.getPassword());
        assertTrue(student.isVerified());
    }

    // 2. Second constructor should create an unverified student
    @Test
    void testUnverifiedStudentInitialization() {
        Student newStudent = new Student(
                "ST002",
                "newstudent@yorku.ca",
                "newpass",
                222222222L
        );

        assertEquals("ST002", newStudent.getId());
        assertFalse(newStudent.isVerified());
    }

    // 3. Student should have the correct role and hourly rate
    @Test
    void testStudentRoleAndRate() {
        assertEquals("Student", student.getRoleName());
        assertEquals(20.0, student.getHourlyRate(), 0.001);
        assertTrue(student.getHourlyRate() > 0);
    }

    // 4. Login should distinguish correct and incorrect passwords
    @Test
    void testStudentLoginAuthentication() {
        assertTrue(student.login("studentpass"));
        assertFalse(student.login("wrongpass"));
        assertFalse(student.login("Studentpass"));
    }

    // 5. Empty password should not authenticate the student
    @Test
    void testLoginWithEmptyPassword() {
        assertFalse(student.login(""));
    }

    // 6. Extra spaces should change the password
    @Test
    void testLoginWithExtraSpaces() {
        assertFalse(student.login(" studentpass"));
        assertFalse(student.login("studentpass "));
    }

    // 7. Students can have different verification states
    @Test
    void testDifferentVerificationStates() {
        Student verified = new Student(
                "ST003", "verified@yorku.ca",
                "pass1", true, 333333333L
        );

        Student unverified = new Student(
                "ST004", "unverified@yorku.ca",
                "pass2", false, 444444444L
        );

        assertTrue(verified.isVerified());
        assertFalse(unverified.isVerified());
    }

    // 8. Different students should maintain independent information
    @Test
    void testIndependentStudentObjects() {
        Student otherStudent = new Student(
                "ST005",
                "other@yorku.ca",
                "otherpass",
                false,
                555555555L
        );

        assertNotEquals(student.getId(), otherStudent.getId());
        assertNotEquals(student.getEmail(), otherStudent.getEmail());
        assertNotEquals(student.getPassword(), otherStudent.getPassword());
    }

    // 9. Long passwords should still work correctly
    @Test
    void testLongStudentPassword() {
        String password = "VeryLongStudentPassword123456789";

        Student longPasswordStudent = new Student(
                "ST006",
                "long@yorku.ca",
                password,
                true,
                666666666L
        );

        assertTrue(longPasswordStudent.login(password));
        assertFalse(longPasswordStudent.login("VeryLongStudentPassword"));
    }

    // 10. Role and rate should remain consistent between students
    @Test
    void testStudentRoleAndRateConsistency() {
        Student anotherStudent = new Student(
                "ST007",
                "another@yorku.ca",
                "abc123",
                false,
                777777777L
        );

        assertEquals(student.getRoleName(), anotherStudent.getRoleName());
        assertEquals(student.getHourlyRate(),
                anotherStudent.getHourlyRate(), 0.001);

        assertEquals("Student", anotherStudent.getRoleName());
        assertEquals(20.0, anotherStudent.getHourlyRate(), 0.001);
    }
}