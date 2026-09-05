package main;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisabledStateAITest {

    private DisabledState disabledState;
    private Room room;

    @BeforeEach
    void setUp() {
        disabledState = new DisabledState();
        room = new Room("R101", "Bergeron", 30, "DISABLED");
    }

    @Test
    void testGetStatusReturnsDisabled() {
        assertEquals("DISABLED", disabledState.getStatus());
    }

    @Test
    void testEnableTransitionsToAvailableState() {
        disabledState.enable(room);
        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    void testDisableKeepsStateDisabled() {
        disabledState.disable(room);
        assertEquals("DISABLED", room.getStatus());
        assertFalse(room.isAvailable());
    }

    @Test
    void testCloseTransitionsToClosedState() {
        disabledState.close(room);
        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
    }

    @Test
    void testRoomEnableDelegation() {
        room.enable();
        assertEquals("AVAILABLE", room.getStatus());
    }

    @Test
    void testRoomDisableDelegation() {
        room.disable();
        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testRoomCloseDelegation() {
        room.close();
        assertEquals("CLOSED", room.getStatus());
    }

    @Test
    void testSequentialStateChanges() {
        disabledState.enable(room);
        assertEquals("AVAILABLE", room.getStatus());
        room.disable();
        assertEquals("DISABLED", room.getStatus());
        room.close();
        assertEquals("CLOSED", room.getStatus());
    }

    @Test
    void testInterfaceReference() {
        RoomState state = new DisabledState();
        assertNotNull(state.getStatus());
        assertEquals("DISABLED", state.getStatus());
    }

    @Test
    void testStatusNotNullOrEmpty() {
        assertNotNull(disabledState.getStatus());
        assertFalse(disabledState.getStatus().trim().isEmpty());
    }
}