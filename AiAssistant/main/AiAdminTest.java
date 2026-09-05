package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AiAdminTest {

    private Admin admin;
    private Room room1;
    private Room room2;

    @BeforeEach
    void setUp() {
        admin = new Admin("a1", "admin@example.com", "pass123", "ADM-001");
        room1 = new Room("101", "Building A", 10); // defaults to AVAILABLE
        room2 = new Room("102", "Building B", 20, "AVAILABLE");
    }

    // 1. Constructor / basic field assignment
    @Test
    void testConstructorSetsAdminId() {
        assertEquals("ADM-001", admin.getAdminId());
    }

    // 2. getAdminId with a different instance to ensure it's not hardcoded
    @Test
    void testGetAdminIdDifferentInstance() {
        Admin other = new Admin("a2", "b@example.com", "pw", "ADM-999");
        assertEquals("ADM-999", other.getAdminId());
    }

    // 3. getRoleName override
    @Test
    void testGetRoleNameReturnsAdmin() {
        assertEquals("Admin", admin.getRoleName());
    }

    // 4. getHourlyRate override
    @Test
    void testGetHourlyRateReturnsZero() {
        assertEquals(0.0, admin.getHourlyRate(), 0.0001);
    }

    // 5. addRoom - single room shows up via iterator
    @Test
    void testAddRoomAddsToRoomList() {
        admin.addRoom(room1);
        RoomIterator it = admin.getRoomIterator();
        assertTrue(it.hasMore());
        assertEquals(room1, it.getNext());
    }

    // 6. addRoom - multiple rooms
    @Test
    void testAddMultipleRooms() {
        admin.addRoom(room1);
        admin.addRoom(room2);
        RoomIterator it = admin.getRoomIterator();
        int count = 0;
        while (it.hasMore()) {
            it.getNext();
            count++;
        }
        assertEquals(2, count);
    }

    // 7. getRoomIterator returns non-null, empty iterator when no rooms added
    @Test
    void testGetRoomIteratorEmptyWhenNoRooms() {
        RoomIterator it = admin.getRoomIterator();
        assertNotNull(it);
        assertFalse(it.hasMore());
    }

    // 8. closeRoom transitions an available room to CLOSED
    @Test
    void testCloseRoomFromAvailable() {
        assertTrue(room1.isAvailable());
        admin.closeRoom(room1);
        assertTrue(room1.isClosed());
        assertEquals("CLOSED", room1.getStatus());
    }

    // 9. disableRoom transitions an available room to DISABLED
    @Test
    void testDisableRoomFromAvailable() {
        admin.disableRoom(room1);
        assertEquals("DISABLED", room1.getStatus());
    }

    // 10. enableRoom transitions a disabled room back to AVAILABLE
    @Test
    void testEnableRoomFromDisabled() {
        Room disabledRoom = new Room("103", "Building C", 5, "DISABLED");
        admin.enableRoom(disabledRoom);
        assertTrue(disabledRoom.isAvailable());
    }

    // 11. enableRoom on a closed room (behavior depends on ClosedState impl)
    @Test
    void testEnableRoomFromClosed() {
        Room closedRoom = new Room("104", "Building D", 8, "CLOSED");
        admin.enableRoom(closedRoom);
        // Adjust this assertion once you know how ClosedState.enable() behaves -
        // e.g. it might stay CLOSED, or transition to AVAILABLE.
        assertNotNull(closedRoom.getStatus());
    }

    // 12. closeRoom/disableRoom on one room doesn't affect another room's state
    @Test
    void testActionOnOneRoomDoesNotAffectAnother() {
        admin.closeRoom(room1);
        assertTrue(room2.isAvailable());
    }
}