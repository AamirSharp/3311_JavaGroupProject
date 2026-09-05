package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentBookingDecoratorTest {

	private Booking booking;
	private StudentBookingDecorator studentBooking;
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
				20.0,
				null,
				null);

		studentBooking = new StudentBookingDecorator(booking);
	}

	@Test
	void testOneHourCost() {
		assertEquals(20.0, studentBooking.cost());
	}

	@Test
	void testTwoHourCost() {
		Booking b = new Booking("B002", null, start, start.plusHours(2),
				"BOOKED", 10.0, 40.0, null, null);

		StudentBookingDecorator s = new StudentBookingDecorator(b);
		assertEquals(40.0, s.cost());
	}

	@Test
	void testHalfHourCost() {
		Booking b = new Booking("B003", null, start, start.plusMinutes(30),
				"BOOKED", 10.0, 10.0, null, null);

		StudentBookingDecorator s = new StudentBookingDecorator(b);
		assertEquals(10.0, s.cost());
	}

	@Test
	void testHourAndHalfCost() {
		Booking b = new Booking("B004", null, start, start.plusMinutes(90),
				"BOOKED", 10.0, 30.0, null, null);

		StudentBookingDecorator s = new StudentBookingDecorator(b);
		assertEquals(30.0, s.cost());
	}

	@Test
	void testThreeHourCost() {
		Booking b = new Booking("B005", null, start, start.plusHours(3),
				"BOOKED", 10.0, 60.0, null, null);

		StudentBookingDecorator s = new StudentBookingDecorator(b);
		assertEquals(60.0, s.cost());
	}

	@Test
	void testDescriptionHasStudentRate() {
		assertTrue(studentBooking.getDescription().contains("Student Rate"));
	}

	@Test
	void testDescriptionHas20() {
		assertTrue(studentBooking.getDescription().contains("$20/hr"));
	}

	@Test
	void testBookingId() {
		assertEquals("B001", studentBooking.getBookingId());
	}

	@Test
	void testStartTime() {
		assertEquals(start, studentBooking.getStartTime());
	}

	@Test
	void testEndTime() {
		assertEquals(start.plusHours(1), studentBooking.getEndTime());
	}
}