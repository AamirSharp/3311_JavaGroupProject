package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChiefEventCoordinatorTest {

    @Test
    void testGetInstanceNotNull() {
        assertNotNull(ChiefEventCoordinator.getInstance());
    }

    @Test
    void testGetInstanceReturnsSameObject() {
        ChiefEventCoordinator c1 = ChiefEventCoordinator.getInstance();
        ChiefEventCoordinator c2 = ChiefEventCoordinator.getInstance();

        assertSame(c1, c2);
    }

    @Test
    void testRoleName() {
        assertEquals("Chief Event Coordinator",
                ChiefEventCoordinator.getInstance().getRoleName());
    }

    @Test
    void testGenerateAdminAccReturnsAdmin() {
        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("test@yorku.ca");

        assertNotNull(admin);
    }

    @Test
    void testGenerateAdminAccEmail() {
        String email = "abc@yorku.ca";

        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc(email);

        assertEquals(email, admin.getEmail());
    }

    @Test
    void testGenerateAdminAccAdminIdStartsWithAb() {
        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("abc@yorku.ca");

        assertTrue(admin.getAdminId().startsWith("ab"));
    }

    @Test
    void testGenerateAdminAccIdStartsWithCd() {
        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("abc@yorku.ca");

        assertTrue(admin.getId().startsWith("cd"));
    }

    @Test
    void testGenerateAdminAccPasswordNotNull() {
        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("abc@yorku.ca");

        assertNotNull(admin.getPassword());
    }

    @Test
    void testGenerateAdminAccPasswordLength() {
        Admin admin = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("abc@yorku.ca");

        assertEquals(8, admin.getPassword().length());
    }

    @Test
    void testGenerateAdminAccCreatesDifferentAccounts() {
        Admin a1 = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("one@yorku.ca");

        Admin a2 = ChiefEventCoordinator.getInstance()
                .generateAdminAcc("two@yorku.ca");

        assertNotEquals(a1.getId(), a2.getId());
    }

}