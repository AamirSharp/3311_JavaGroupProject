package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AiAvailableStateTest {
 
    private AvailableState availableState;
    private Room room;

    @BeforeEach
    void setUp() {
        availableState = new AvailableState();
        room = new Room("101", "Building A", 10, "AVAILABLE");
    }

    // 1. getStatus returns correct string
    @Test
    void testGetStatusReturnsAvailable() {
        assertEquals("AVAILABLE", availableState.getStatus());
    }

    // 2. enable() on an available room is a no-op - status unchanged
    @Test
    void testEnableDoesNotChangeStatus() {
        room.enable();
        assertEquals("AVAILABLE", room.getStatus());
    }


    // 4. disable() transitions room to DISABLED
    @Test
    void testDisableTransitionsToDisabled() {
        room.disable();
        assertEquals("DISABLED", room.getStatus());
    }

    // 5. close() transitions room to CLOSED
    @Test
    void testCloseTransitionsToClosed() {
        room.close();
        assertEquals("CLOSED", room.getStatus());
    }

    // 6. isAvailable() is true before any transition
    @Test
    void testIsAvailableTrueInitially() {
        assertTrue(room.isAvailable());
    }

    // 7. isAvailable() becomes false after disable()
    @Test
    void testIsAvailableFalseAfterDisable() {
        room.disable();
        assertFalse(room.isAvailable());
    }

    // 8. isAvailable() becomes false after close()
    @Test
    void testIsAvailableFalseAfterClose() {
        room.close();
        assertFalse(room.isAvailable());
    }

    // 9. isClosed() correctly false while available
    @Test
    void testIsClosedFalseInitially() {
        assertFalse(room.isClosed());
    }

    // 10. isClosed() true only after close(), not after disable()
    @Test
    void testIsClosedFalseAfterDisable() {
        room.disable();
        assertFalse(room.isClosed());
    }

    // 11. Calling disable() directly on the state object (not via Room) works
    @Test
    void testDisableCalledDirectlyOnState() {
        availableState.disable(room);
        assertEquals("DISABLED", room.getStatus());
    }

    // 12. Calling close() directly on the state object (not via Room) works
    @Test
    void testCloseCalledDirectlyOnState() {
        availableState.close(room);
        assertEquals("CLOSED", room.getStatus());
    }

    // 13. Two independent rooms don't affect each other's state
    @Test
    void testStateChangeIsolatedPerRoom() {
        Room otherRoom = new Room("102", "Building B", 15, "AVAILABLE");
        room.disable();
        assertTrue(otherRoom.isAvailable());
    }
}