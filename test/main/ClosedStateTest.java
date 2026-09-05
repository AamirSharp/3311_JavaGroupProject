package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosedStateTest {

    @Test
    void testGetStatusReturnsClosed() {
        ClosedState state = new ClosedState();

        assertEquals("CLOSED", state.getStatus());
    }

    @Test
    void testEnableChangesRoomToAvailable() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.enable(room);

        assertEquals("AVAILABLE", room.getStatus());
    }

    @Test
    void testEnableMakesRoomAvailable() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.enable(room);

        assertTrue(room.isAvailable());
    }

    @Test
    void testDisableChangesRoomToDisabled() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.disable(room);

        assertEquals("DISABLED", room.getStatus());
    }

    @Test
    void testDisableMakesRoomNotAvailable() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.disable(room);

        assertFalse(room.isAvailable());
    }

    @Test
    void testCloseKeepsRoomClosed() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.close(room);

        assertEquals("CLOSED", room.getStatus());
    }

    @Test
    void testCloseKeepsRoomClosedFlag() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();
        state.close(room);

        assertTrue(room.isClosed());
    }

    @Test
    void testEnableAfterDisableReturnsAvailable() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();

        state.disable(room);
        room.enable();

        assertEquals("AVAILABLE", room.getStatus());
    }

    @Test
    void testMultipleEnableCallsRemainAvailable() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();

        state.enable(room);
        state.enable(room);

        assertEquals("AVAILABLE", room.getStatus());
    }

    @Test
    void testMultipleDisableCallsRemainDisabled() {
        Room room = new Room("101", "ACE", 30, "CLOSED");

        ClosedState state = new ClosedState();

        state.disable(room);
        state.disable(room);

        assertEquals("DISABLED", room.getStatus());
    }
}