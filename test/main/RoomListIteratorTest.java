package main; 

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RoomListIteratorTest {
	 private RoomList roomList;
	 private List<Room> rooms = new ArrayList<>();
	 private RoomIterator iterator;
	 private int count;


	 @BeforeEach
	 public void setUp() {
	     roomList = new RoomList();
	     iterator = roomList.createIterator();
	     count = 0;
		 roomList.addRoom(new Room("A", "LAS", 0, "OPEN"));
		 roomList.addRoom(new Room("B", "LAS", 0, "CLOSED"));
		 roomList.addRoom(new Room("C", "LAS", 0, "CLOSED"));
		 roomList.addRoom(new Room("107","ROSS", 0, "OPEN"));
		 roomList.addRoom(new Room("108","ROSS", 0, "CLOSED"));
		 roomList.addRoom(new Room("109","ACW", 0, "OPEN"));
		 roomList.addRoom(new Room("209","ACW", 0, "OPEN"));
	        
	 }
	 
	 @Test
		public void testGetNextEmptyList() {
			RoomList emptyList = new RoomList();
			RoomIterator emptyIterator = emptyList.createIterator();

			assertNull(emptyIterator.getNext());
		}
	 	
	 
	 @Test
		public void testHasMoreEmptyList() {
			RoomList emptyList = new RoomList();
			RoomIterator emptyIterator = emptyList.createIterator();

			assertFalse(emptyIterator.hasMore());
		}
	 
		
	 @Test
		public void testHasMoreOnList() {			
			assertTrue(iterator.hasMore());
		}
	
	 
	 @Test
		public void testHasMoreAfterLast() {
			RoomList list = new RoomList();
			list.addRoom(new Room("B", "LAS", 0, "CLOSED"));
			RoomIterator it = list.createIterator();

			it.getNext(); 

			assertFalse(it.hasMore());  
		}
	 
	

	@Test
		public void testRoomIteratorCount() {
			while (iterator.hasMore()) {
				    iterator.getNext();
					count++;
					}
			assertEquals(7, count);
				}

		
	
	@Test
		public void testCountAvailableRooms() {
			while (iterator.hasMore()) {
				if (iterator.getNext().isAvailable()) {
					count++;
					}
				}
				assertEquals(4, count);
			}
	
	@Test
	public void testCountClosedRooms() {
		while (iterator.hasMore()) {
			if (iterator.getNext().isClosed()) {
				count++;
			}
		}
		assertEquals(3, count);
	}
	
	
	
	@Test
	public void testGetNextList() {
		assertEquals("A", iterator.getNext().getRoomNumber());
		assertEquals("B", iterator.getNext().getRoomNumber());
	}
	
	@Test
	public void getNextAtEnd() {
		while (iterator.hasMore()) {
			iterator.getNext();
		}

		assertNull(iterator.getNext());   
	}	
	

	@Test
	public void testGetNextStatus() {
		iterator.getNext(); 
		iterator.getNext(); 
		iterator.getNext(); 
		assertEquals("AVAILABLE", iterator.getNext().getStatus()); 
	}
	
}
