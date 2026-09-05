package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffBookingDecoratorTest {

	private Booking booking;
	private StaffBookingDecorator staffBooking;
	private LocalDateTime start;

	@BeforeEach
	void setup() {
		start = LocalDateTime.of(2026, 8, 10, 10, 0);

		booking = new Booking(
				"B001",
				null,
				start,
				start.plusHours(1),
				"BOOKED",
				10.0,
				40.0,
				null,
				null);

		staffBooking = new StaffBookingDecorator(booking);
	}

	@Test
	void testOneHourCost() {
		assertEquals(40.0, staffBooking.cost());
	}

	@Test
	void testTwoHourCost() {
		Booking b = new Booking("B002", null, start, start.plusHours(2),
				"BOOKED", 10.0, 80.0, null, null);

		StaffBookingDecorator s = new StaffBookingDecorator(b);
		assertEquals(80.0, s.cost());
	}

	@Test
	void testHalfHourCost() {
		Booking b = new Booking("B003", null, start, start.plusMinutes(30),
				"BOOKED", 10.0, 20.0, null, null);

		StaffBookingDecorator s = new StaffBookingDecorator(b);
		assertEquals(20.0, s.cost());
	}

	@Test
	void testHourAndHalfCost() {
		Booking b = new Booking("B004", null, start, start.plusMinutes(90),
				"BOOKED", 10.0, 60.0, null, null);

		StaffBookingDecorator s = new StaffBookingDecorator(b);
		assertEquals(60.0, s.cost());
	}

	@Test
	void testThreeHourCost() {
		Booking b = new Booking("B005", null, start, start.plusHours(3),
				"BOOKED", 10.0, 120.0, null, null);

		StaffBookingDecorator s = new StaffBookingDecorator(b);
		assertEquals(120.0, s.cost());
	}

	@Test
	void testDescriptionHasStaffRate() {
		assertTrue(staffBooking.getDescription().contains("Staff Rate"));
	}

	@Test
	void testDescriptionHas40() {
		assertTrue(staffBooking.getDescription().contains("$40/hr"));
	}

	@Test
	void testBookingId() {
		assertEquals("B001", staffBooking.getBookingId());
	}

	@Test
	void testStartTime() {
		assertEquals(start, staffBooking.getStartTime());
	}

	@Test
	void testEndTime() {
		assertEquals(start.plusHours(1), staffBooking.getEndTime());
	}
}