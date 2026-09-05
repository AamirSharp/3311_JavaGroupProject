package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AiUserFactoryTest {


    @Test
    public void testCreateStudentUser() {
        User user = UserFactory.createUser(
                "STUDENT",
                "S001",
                "student@test.com",
                "password",
                true,
                123456L
        );

        assertNotNull(user);
        assertTrue(user instanceof Student);
    }


    @Test
    public void testCreateFacultyUser() {
        User user = UserFactory.createUser(
                "FACULTY",
                "F001",
                "faculty@test.com",
                "password",
                true,
                123457L
        );

        assertNotNull(user);
        assertTrue(user instanceof Faculty);
    }


    @Test
    public void testCreateStaffUser() {
        User user = UserFactory.createUser(
                "STAFF",
                "ST001",
                "staff@test.com",
                "password",
                true,
                123458L
        );

        assertNotNull(user);
        assertTrue(user instanceof Staff);
    }


    @Test
    public void testCreatePartnerUser() {
        User user = UserFactory.createUser(
                "PARTNER",
                "P001",
                "partner@test.com",
                "password",
                true,
                123459L
        );

        assertNotNull(user);
        assertTrue(user instanceof Partner);
    }


    @Test
    public void testAccountTypeIsCaseInsensitive() {
        User user = UserFactory.createUser(
                "student",
                "S002",
                "lower@test.com",
                "password",
                true,
                123460L
        );

        assertTrue(user instanceof Student);
    }


    @Test
    public void testInvalidAccountTypeThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> UserFactory.createUser(
                        "UNKNOWN",
                        "X001",
                        "unknown@test.com",
                        "password",
                        true,
                        123461L
                )
        );
    }


    @Test
    public void testCreatedUserHasCorrectEmail() {
        User user = UserFactory.createUser(
                "STUDENT",
                "S003",
                "email@test.com",
                "password",
                true,
                123462L
        );

        assertEquals(
                "email@test.com",
                user.getEmail()
        );
    }


    @Test
    public void testCreatedUserHasCorrectId() {
        User user = UserFactory.createUser(
                "FACULTY",
                "F002",
                "faculty2@test.com",
                "password",
                true,
                123463L
        );

        assertEquals(
                "F002",
                user.getId()
        );
    }
}