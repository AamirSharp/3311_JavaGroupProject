package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisabledStateTest {

    private DisabledState disabledState;
    private Room room;

    @BeforeEach
    void setUp() {
        disabledState = new DisabledState();
        room = new Room("101", "Lassonde", 30, "DISABLED");
    }

    @Test
    void testGetStatus() {
        assertEquals("DISABLED", disabledState.getStatus());
    }

    @Test
    void testEnableTransitionsToAvailable() {
        disabledState.enable(room);
        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    void testDisableKeepsDisabledState() {
        disabledState.disable(room);
        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testCloseTransitionsToClosed() {
        disabledState.close(room);
        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
    }

    @Test
    void testRoomEnableDelegatesToState() {
        room.enable();
        assertEquals("AVAILABLE", room.getStatus());
    }

    @Test
    void testRoomDisableDelegatesToState() {
        room.disable();
        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testRoomCloseDelegatesToState() {
        room.close();
        assertEquals("CLOSED", room.getStatus());
    }

    @Test
    void testMultipleEnableTransitions() {
        disabledState.enable(room);
        assertEquals("AVAILABLE", room.getStatus());
        room.disable();
        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testStateNotNull() {
        assertNotNull(disabledState.getStatus());
        assertFalse(disabledState.getStatus().isEmpty());
    }

    @Test
    void testInterfaceReference() {
        RoomState state = new DisabledState();
        assertEquals("DISABLED", state.getStatus());
    }
}
