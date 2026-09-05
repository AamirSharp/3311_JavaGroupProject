package main;

import static org.junit.jupiter.api.Assertions.*;	

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test; 

public class UserTest {
	private User user;
	private Room room;
	
	@BeforeEach
	void setup() {
		user =new Student("002","me@yorku.ca","You@213456",true,12345678L);
		room =new Room("105","LSB",150,"AVAILABLE");
	}
	
	@Test
	void testLogin() {
		assertTrue(user.login("You@213456"));
	}
	
	@Test
	void testFailLogin() {
		assertFalse(user.login("we"));
	}
	
	@Test
	void testBooking() {
		LocalDateTime start=LocalDateTime.now().plusHours(1);
		LocalDateTime end=start.plusHours(3);
		
		Booking book=user.booking(room, start, end);
		
		double deposit=user.getHourlyRate();
		double total=user.getHourlyRate()*3;
		assertEquals(deposit,book.getDeposit());
		assertEquals(total,book.getTotal());
	}
	
	@Test
	void testGetEmail() {
		assertEquals("me@yorku.ca",user.getEmail());
	}
	
	@Test
	void testGetPassword() {
		assertEquals("You@213456",user.getPassword());
	}
	
	@Test
	void testIsVerified() {
		assertTrue(user.isVerified());
	}
	
	@Test
	void testGetId() {
		assertEquals("002",user.getId());
	}
	
	@Test
	void testFailBooking() {
		LocalDateTime start=LocalDateTime.now().plusHours(1);
		LocalDateTime end=start.plusHours(2);
		
		Booking book=new Booking("1002",room,start,end,"BOOKED",20.0,40.0,null,user);
		AppData.bookings.add(book);
		LocalDateTime newStart=start.minusMinutes(30);
		LocalDateTime newEnd=end.minusMinutes(30);
		
		assertThrows(IllegalStateException.class,()->user.booking(room,newStart,newEnd));
	}
	
	@Test
	void testFailBookingVerification() {
		user =new Student("002","me@yorku.ca","You@213456",false,12345678L);
		LocalDateTime start=LocalDateTime.now().plusHours(1);
		LocalDateTime end=start.plusHours(3);
		assertThrows(IllegalStateException.class,()->user.booking(room,start,end));
	}
	
	@Test
	void testFailBookingNotAvailable() {
		Room closedRoom=new Room("1002","LAS",100,"CLOSED");
		LocalDateTime start=LocalDateTime.now().plusHours(1);
		LocalDateTime end=start.plusHours(3);
		assertThrows(IllegalStateException.class,()->user.booking(closedRoom,start,end));

		
	}
	
	
}
