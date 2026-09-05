package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class RoomTest {
	private Room room;

	@BeforeEach
	void setup() {
		room = new Room("10", "LSB", 100, "AVAILABLE");
	}

	@Test
	void testCorrectAttriubutes() {
		assertEquals("10", room.getRoomNumber());
		assertEquals("LSB", room.getBuilding());
		assertEquals(100, room.getCapacity());
	}

	@Test
	void testAvailability() {
		Room normalRoom = new Room("A", "VH", 100);
		assertEquals("AVAILABLE", normalRoom.getStatus());
		assertTrue(normalRoom.isAvailable());
	}

	@Test
	void testDisablityOfRoom() {
		Room disabledRoom = new Room("A", "VH", 100, "DISABLED");
		assertEquals("DISABLED", disabledRoom.getStatus());
		assertFalse(disabledRoom.isAvailable());
	}

	@Test
	void testConstructorClosed() {
		Room closedRoom = new Room("B", "VH", 100, "CLOSED");
		assertEquals("CLOSED", closedRoom.getStatus());
		assertTrue(closedRoom.isClosed());
	}

	@Test
	void testAvailablilityStart() {
		assertTrue(room.isAvailable());
		assertFalse(room.isClosed());
	}

	@Test
	void testisClosed() {
		room.close();
		assertEquals("CLOSED", room.getStatus());
		assertTrue(room.isClosed());
		assertFalse(room.isAvailable());
	}

	@Test
	void testDisabled() {
		room.disable();
		assertEquals("DISABLED", room.getStatus());
		assertFalse(room.isAvailable());
		assertFalse(room.isClosed());
	}

	@Test
	void testEnableAndThenDisable() {
		room.disable();
		room.enable();
		assertEquals("AVAILABLE", room.getStatus());
		assertTrue(room.isAvailable());
	}

	@Test
	void testSetState() {
		room.setState(new ClosedState());
		assertEquals("CLOSED", room.getStatus());
		assertTrue(room.isClosed());
	}

	@Test
	void testUpdate() {
		Badge badge = new Badge("BADGE-001");
		room.update(badge);
	}
}
