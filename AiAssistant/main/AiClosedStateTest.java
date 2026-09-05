package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AiClosedStateTest {

    private ClosedState state;
    private Room room;

    @BeforeEach
    void setUp() {
        state = new ClosedState();
        room = new Room("101", "Conference Room", 25, "CLOSED");
    }

    @Test
    void testGetStatusReturnsClosed() {
        assertEquals("CLOSED", state.getStatus());
    }

    @Test
    void testEnableChangesRoomToAvailable() {
        state.enable(room);

        assertEquals("AVAILABLE", room.getStatus());
        assertTrue(room.isAvailable());
    }

    @Test
    void testDisableChangesRoomToDisabled() {
        state.disable(room);

        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testCloseDoesNothingWhenAlreadyClosed() {
        state.close(room);

        assertEquals("CLOSED", room.getStatus());
        assertTrue(room.isClosed());
    }

    @Test
    void testEnableThenDisableTransitions() {
        state.enable(room);
        assertEquals("AVAILABLE", room.getStatus());

        room.disable();
        assertEquals("DISABLED", room.getStatus());
    }
}