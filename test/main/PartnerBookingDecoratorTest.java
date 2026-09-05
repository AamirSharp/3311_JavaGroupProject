package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class PartnerBookingDecoratorTest {
	private Room room;
	private Booking baseBooking;
	private User user;
	private PartnerBookingDecorator decorator;
	private LocalDateTime start;
	private LocalDateTime end;

	@BeforeEach
	void setup() {
		room = new Room("100", "LSB", 100, "AVAILABLE");
		user = new Partner("1", "partner@yorku.ca", "eecs3311!", 331133113311L);
		start = LocalDateTime.now();
		end = start.plusHours(1);
		baseBooking = new Booking("2", room, start, end, "PENDING", 20.0, 40.0, start, user);
		decorator = new PartnerBookingDecorator(baseBooking);
	}

	@Test
	void testCostoneHour() {
		assertEquals(50.0, decorator.cost());
	}

	@Test
	void testCostfourHour() {
		LocalDateTime longerEnd = start.plusHours(4);
		Booking fourHourBooking = new Booking("3", room, start, longerEnd, "PENDING", 20.0, 40.0, start, user);
		PartnerBookingDecorator fourHourDecorator = new PartnerBookingDecorator(fourHourBooking);
		assertEquals(200.0, fourHourDecorator.cost());
	}
	@Test
	void testAddingZeroHours() {
		LocalDateTime longerEnd = start.plusHours(0);
		Booking ZeroHourBooking = new Booking("3", room, start, longerEnd, "PENDING", 20.0, 40.0, start, user);
		PartnerBookingDecorator ZeroHourDecorator = new PartnerBookingDecorator(ZeroHourBooking);
		assertEquals(0.0, ZeroHourDecorator.cost());
	}
	@Test
	void testCostHalfHour() {
		LocalDateTime shortEnd = start.plusMinutes(30);
		Booking halfHourBooking = new Booking("3", room, start, shortEnd, "PENDING", 20.0, 40.0, start, user);
		PartnerBookingDecorator halfHourDecorator = new PartnerBookingDecorator(halfHourBooking);
		assertEquals(25.0, halfHourDecorator.cost());
	}
	@Test
	void testInheritanceOfStartAndEndTime() {
		assertEquals(baseBooking.getStartTime(), decorator.getStartTime());
		assertEquals(baseBooking.getEndTime(), decorator.getEndTime());
	}

	@Test
	void testInheritanceofBooked() {
		assertEquals(baseBooking.getBookedBy(), decorator.getBookedBy());
	}
	
	@Test
	void testDescriptionofthePartnerRate() {
		assertTrue(decorator.getDescription().contains("Partner Rate: $50/hr"));
	}
	
	@Test
	void testFalseDescriptionofthePartnerRate() {
		assertFalse(decorator.getDescription().contains("Rate: $60/hr"));
	}
	

	@Test
	void testDescription() {
		String Description = baseBooking.getDescription();
		assertTrue(decorator.getDescription().startsWith(Description));
	}

	@Test
	void testInhertionOfBookingAttributes() {
		assertEquals(baseBooking.getBookingId(), decorator.getBookingId());
		assertEquals(baseBooking.getRoom(), decorator.getRoom());
	}
}
