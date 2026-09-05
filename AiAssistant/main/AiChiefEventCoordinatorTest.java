package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AiChiefEventCoordinatorTest {

    @Test
    void testSingletonReturnsInstance() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();
        assertNotNull(coordinator);
    }

    @Test
    void testSingletonAlwaysReturnsSameObject() {
        ChiefEventCoordinator first = ChiefEventCoordinator.getInstance();
        ChiefEventCoordinator second = ChiefEventCoordinator.getInstance();

        assertSame(first, second);
    }

    @Test
    void testRoleName() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();

        assertEquals("Chief Event Coordinator", coordinator.getRoleName());
    }

    @Test
    void testGenerateAdminAccountReturnsAdmin() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();

        Admin admin = coordinator.generateAdminAcc("admin@test.com");

        assertNotNull(admin);
    }

    @Test
    void testGeneratedAdminEmail() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();

        Admin admin = coordinator.generateAdminAcc("admin@test.com");

        assertEquals("admin@test.com", admin.getEmail());
    }

    @Test
    void testGeneratedAdminRole() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();

        Admin admin = coordinator.generateAdminAcc("admin@test.com");

        assertEquals("Admin", admin.getRoleName());
    }

    @Test
    void testGeneratedAdminHasId() {
        ChiefEventCoordinator coordinator = ChiefEventCoordinator.getInstance();

        Admin admin = coordinator.generateAdminAcc("admin@test.com");

        assertNotNull(admin.getId());
    }

}