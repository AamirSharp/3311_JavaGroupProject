package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AIRoomListIterator {

    // Simple fake Room class for testing
    class FakeRoom extends Room {
        private String roomNumber;

        public FakeRoom(String roomNumber) {
            super(null, null, 0);
            this.roomNumber = roomNumber;
        }

        @Override
        public String getRoomNumber() {
            return roomNumber;
        }
    }


    @Test
    public void testIteratorConstructor() {
        List<Room> rooms = new ArrayList<>();

        RoomListIterator iterator = new RoomListIterator(rooms);

        assertNotNull(iterator);
        assertFalse(iterator.hasMore());
    }


    @Test
    public void testHasMoreWhenRoomsExist() {
        List<Room> rooms = new ArrayList<>();

        rooms.add(new FakeRoom("101"));

        RoomListIterator iterator = new RoomListIterator(rooms);

        assertTrue(iterator.hasMore());
    }


    @Test
    public void testGetNextReturnsFirstRoom() {
        List<Room> rooms = new ArrayList<>();

        Room room = new FakeRoom("101");
        rooms.add(room);

        RoomListIterator iterator = new RoomListIterator(rooms);

        Room result = iterator.getNext();

        assertEquals(room, result);
    }


    @Test
    public void testGetNextReturnsRoomsInOrder() {
        List<Room> rooms = new ArrayList<>();

        Room room1 = new FakeRoom("101");
        Room room2 = new FakeRoom("102");

        rooms.add(room1);
        rooms.add(room2);

        RoomListIterator iterator = new RoomListIterator(rooms);

        assertEquals(room1, iterator.getNext());
        assertEquals(room2, iterator.getNext());
    }


    @Test
    public void testHasMoreFalseAfterAllRoomsReturned() {
        List<Room> rooms = new ArrayList<>();

        rooms.add(new FakeRoom("101"));

        RoomListIterator iterator = new RoomListIterator(rooms);

        iterator.getNext();

        assertFalse(iterator.hasMore());
    }

    

    @Test
    public void testGetNextReturnsNullWhenNoMoreRooms() {
        List<Room> rooms = new ArrayList<>();

        rooms.add(new FakeRoom("101"));

        RoomListIterator iterator = new RoomListIterator(rooms);

        iterator.getNext();

        Room result = iterator.getNext();

        assertNull(result);
    }


    @Test
    public void testEmptyRoomListReturnsNull() {
        List<Room> rooms = new ArrayList<>();

        RoomListIterator iterator = new RoomListIterator(rooms);

        assertNull(iterator.getNext());
        assertFalse(iterator.hasMore());
    }
}