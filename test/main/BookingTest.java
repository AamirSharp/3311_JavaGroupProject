package main;

import static org.junit.jupiter.api.Assertions.*;	

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class BookingTest {
	private Room room;
	private Booking booking;;
	private User user;
	
	@BeforeEach
	void setup() {
		room =new Room("105","LSB",150,"AVAILABLE");
		user =new Student("001","me@yorku.ca","You@2134567",1234567891L);
		LocalDateTime start=LocalDateTime.now().plusHours(2);
		LocalDateTime end=LocalDateTime.now().plusHours(3);
		booking =new Booking("002",room,start,end,"PENDING",20.0,40.0,start,user);
	}
	
	@Test
	void testCreateBooking() {
		booking.createBooking();
		assertEquals("BOOKED",booking.getStatus());
	}
	
	@Test
	void testEditBooking() {
		LocalDateTime start2=LocalDateTime.now().plusHours(4);
		LocalDateTime end2=start2.plusHours(1);
		assertTrue(booking.editBooking(start2, end2));
		assertEquals(start2,booking.getStartTime());
		assertEquals(end2,booking.getEndTime());
	}
	
	@Test
	void testCancelBooking() {
		assertTrue(booking.cancelBooking());
		assertEquals("CANCELLED",booking.getStatus());
	}
	
	@Test
	void testExtendBooking() {
		double deposit=booking.getDeposit();
		double total=booking.getTotal();
		LocalDateTime end3=booking.getEndTime().plusHours(2);
		assertTrue(booking.extendBooking(end3));
		assertEquals(end3,booking.getEndTime());
		assertEquals(total+(2*deposit),booking.getTotal());
	}
	
	@Test
	void testCheckIn() {
		assertFalse(booking.checkIn(new Badge("B1")));
		assertEquals("PENDING",booking.getStatus());
		
	}
	
	@Test
	void testDepositBack() {
		assertTrue(booking.depositBack());
	}
	
	@Test
	void testRoomAvailable() {
		LocalDateTime futureStart=LocalDateTime.now().plusHours(5);
		LocalDateTime futureEnd=futureStart.plusHours(1);
		assertTrue(booking.roomAvailable(room, futureStart, futureEnd));
	}
	
	@Test
	void testFailCHeckInBooking() {
		assertFalse(booking.checkIn(new Badge("B1")));
	}
	
	@Test
	void testFailDepositBack() {
		
		LocalDateTime late=booking.getStartTime().plusMinutes(35);
		LocalDateTime start=LocalDateTime.now().plusHours(2);
		LocalDateTime end=LocalDateTime.now().plusHours(3);
		Booking lateBooking=new Booking("002",room,start,end,"PENDING",20.0,40.0,late,user);
		assertFalse(lateBooking.depositBack());
	}
	
	@Test
	void testCancelBookingFail() {
		LocalDateTime start=LocalDateTime.now().minusHours(2);
		LocalDateTime end=LocalDateTime.now().minusHours(3);
		Booking previousBooking=new Booking("002",room,start,end,"BOOKED",20.0,40.0,null,user);
		assertFalse(previousBooking.cancelBooking());
		assertEquals("BOOKED",previousBooking.getStatus());
	}
	
	@Test
	void testCode() {
		assertEquals(40.0,booking.cost());
	}
	
	@Test
	void testFailExtendBookingEarly() {
		LocalDateTime early=booking.getEndTime().minusMinutes(35);
		assertFalse(booking.extendBooking(early));
	}
	
	@Test
	void testGetters() {
		//LocalDateTime start=LocalDateTime.now().plusHours(2);
		assertEquals("002",booking.getBookingId());
		assertEquals(room,booking.getRoom());
		assertEquals(user,booking.getBookedBy());
	}
	
	@Test
	void testDescription() {
		assertEquals("Standard Room Booking (105)",booking.getDescription());
	} 
	
	@Test
	void testInprogressEditBooking() {
		LocalDateTime prevStart=LocalDateTime.now().minusHours(1);
		LocalDateTime prevEnd=prevStart.plusHours(2);
		LocalDateTime start=LocalDateTime.now().plusHours(1);
		LocalDateTime end=start.plusHours(1);
		Booking IPBooking=new Booking("003",room,prevStart,prevEnd,"PENDING",20.0,40.0,null,user);
		assertFalse(IPBooking.editBooking(start, end));
	}
	
	@Test
	void testLateExtendBooking() {
		LocalDateTime prevStart=LocalDateTime.now().minusHours(3);
		LocalDateTime prevEnd=LocalDateTime.now().minusHours(1);
		Booking prevBooking=new Booking("002",room,prevStart,prevEnd,"BOOKED",20.0,40.0,null,user);
		assertFalse(prevBooking.extendBooking(LocalDateTime.now().plusHours(1)));
	}
	
	@Test
	void testCOnflictRoomAvailable() {
		AppData.bookings.add(booking);
		LocalDateTime conflictStart= booking.getStartTime().plusMinutes(30);
		LocalDateTime conflictEnd=booking.getEndTime().plusMinutes(30);
		assertFalse(Booking.roomAvailable(room,conflictStart,conflictEnd));
	} 
	
	@Test
	void testCOnflictExtendBooking() {
		LocalDateTime conflictStart= booking.getEndTime().plusMinutes(30);
		LocalDateTime conflictEnd=booking.getEndTime().plusHours(2);
		Booking conflictBooking=new Booking("002",room,conflictStart,conflictEnd,"BOOKED",20.0,40.0,null,user);
		AppData.bookings.add(conflictBooking);
		LocalDateTime end=booking.getCheckInTime().plusHours(1);
		assertFalse(booking.extendBooking(end));
	}
	 
	@Test
	void testMultipleCheckIn() {
		LocalDateTime start=LocalDateTime.now().minusMinutes(5);
		LocalDateTime end=start.plusHours(2);
		Booking book=new Booking("002",room,start,end,"BOOKED",20.0,40.0,null,user);
		assertTrue(book.checkIn(new Badge("B1")));
		assertFalse(book.checkIn(new Badge("B1")));
	}
}
