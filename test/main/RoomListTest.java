package main;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class RoomListTest {
	 private RoomList roomList;
	 private List<Room> rooms = new ArrayList<>();
	 private RoomIterator iterator;
	 private int count;
	
	
	 
	 @BeforeEach
	 public void setUp() {
	      roomList = new RoomList();
	      iterator = roomList.createIterator();
	      count = 0;	    
	  
	 }
		
	@Test
	public void testCreateIterator() {
		assertNotNull(iterator);				
	}
	
	
	@Test
	public void testEmptyRoomListIterator() {
		while (iterator.hasMore()) {
			iterator.getNext();
			count++;
		}
		assertEquals(0, count);
	}
	
	@Test
	public void testCheckSingleAddedRoom() {
		roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		while (iterator.hasMore()) {
			iterator.getNext();
			count++;
		}
		assertEquals(1,count);
	}
		
	
	@Test
	public void testCheckMulltipleAddedRoomSize() {
		roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		roomList.addRoom(new Room("B", "LAS", 0, "OPEN"));
		roomList.addRoom(new Room("C", "LAS", 0, "OPEN"));
		while (iterator.hasMore()) {
			iterator.getNext();
			count++;
		}
		assertEquals(3,count);
	}
	
	
	@Test
	public void testMixedStateRoomCount() {
		roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		roomList.addRoom(new Room("B", "LAS", 0, "CLOSED"));
		roomList.addRoom(new Room("C", "LAS", 0, "OPEN"));
		while (iterator.hasMore()) {
			iterator.getNext();
			count++;
		}
		assertEquals(3, count);
	}
	

	
	@Test
	public void testNullRoomAdded() throws NullPointerException {
		assertThrows(NullPointerException.class, () -> roomList.addRoom(new Room(null, null, 0, null)));
				
	}
	
	
	@Test
	public void testRoomExists() {
		Room r1 = new Room("B", "LAS", 0, "OPEN");
		roomList.addRoom(r1);
		roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		
		while (iterator.hasMore()) {
			rooms.add(iterator.getNext());
		}
		assertTrue(rooms.contains(r1));
	}	
	
	
	@Test
	public void testRoomDoesntExists() {
		Room room = new Room("B", "LAS", 0, "OPEN");
		roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		
		while (iterator.hasMore()) {
			rooms.add(iterator.getNext());
		}
		assertFalse(rooms.contains(room));
	}	
	
	
	
	@Test
	public void testAddedRoomBuilding() {
		roomList.addRoom(new Room("A", "LAS", 50, "OPEN"));
		assertEquals("LAS", iterator.getNext().getBuilding());
	}

	
	@Test
	public void testAddedRoomCapacity() {
		roomList.addRoom(new Room("A", "LAS", 50, "OPEN"));
		assertEquals(50, iterator.getNext().getCapacity());
	}
		
}


