package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AiRoomTest {

    @Test
    public void testRoomConstructorWithDefaultAvailableState() {
        Room room = new Room("R101", "Lassonde", 50);

        assertEquals("R101", room.getRoomNumber());
        assertEquals("Lassonde", room.getBuilding());
        assertEquals(50, room.getCapacity());
        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    public void testRoomConstructorWithAvailableStatus() {
        Room room = new Room("R102", "Bergeron", 30, "AVAILABLE");

        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    public void testRoomConstructorWithClosedStatus() {
        Room room = new Room("R103", "Vari Hall", 20, "CLOSED");

        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testRoomConstructorWithDisabledStatus() {
        Room room = new Room("R104", "Dahdaleh", 15, "DISABLED");

        assertEquals("DISABLED", room.getStatus());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testGetRoomInformation() {
        Room room = new Room("R105", "ACE", 100);

        assertEquals("R105", room.getRoomNumber());
        assertEquals("ACE", room.getBuilding());
        assertEquals(100, room.getCapacity());
    }

    @Test
    public void testCloseRoom() {
        Room room = new Room("R106", "Lassonde", 40);

        room.close();

        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testDisableRoom() {
        Room room = new Room("R107", "Bergeron", 40);

        room.disable();

        assertEquals("DISABLED", room.getStatus());
        assertFalse(room.isAvailable());
    }

    @Test
    public void testEnableRoom() {
        Room room = new Room("R108", "Lassonde", 40, "DISABLED");

        room.enable();

        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    public void testSetStateToClosed() {
        Room room = new Room("R109", "ACE", 25);

        room.setState(new ClosedState());

        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
    }

    @Test
    public void testUpdateSensorNotification() {
        Room room = new Room("R110", "Lassonde", 25);
        Badge badge = null;

        assertDoesNotThrow(() -> room.update(badge));
    }
}