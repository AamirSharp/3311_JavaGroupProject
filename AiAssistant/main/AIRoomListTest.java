package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AIRoomListTest {

    @Test
    public void testAddRoom() {
        RoomList roomList = new RoomList();

        Room room = new Room("A", "LAS", 0, "OPEN");

        roomList.addRoom(room);

        RoomIterator iterator = roomList.createIterator();

        assertNotNull(iterator);
        assertTrue(iterator.hasMore());
        assertEquals(room, iterator.getNext());
    }

    @Test
    public void testCreateIteratorReturnsIterator() {
        RoomList roomList = new RoomList();

        RoomIterator iterator = roomList.createIterator();

        assertNotNull(iterator);
    }

    
    @Test
    public void testMultipleRoomsAdded() {
        RoomList roomList = new RoomList();

        Room room1 = new Room("A", "LAS", 0, "OPEN");
        Room room2 = new Room("B", "LAS", 0, "OPEN");

        roomList.addRoom(room1);
        roomList.addRoom(room2);

        RoomIterator iterator = roomList.createIterator();

        assertTrue(iterator.hasMore());
        assertEquals(room1, iterator.getNext());

        assertTrue(iterator.hasMore());
        assertEquals(room2, iterator.getNext());

        assertFalse(iterator.hasMore());
    }

    @Test
    public void testEmptyRoomListIterator() {
        RoomList roomList = new RoomList();

        RoomIterator iterator = roomList.createIterator();

        assertNotNull(iterator);
        assertFalse(iterator.hasMore());
    }
}