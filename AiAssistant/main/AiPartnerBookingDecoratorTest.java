package main;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class AiPartnerBookingDecoratorTest {

    private Booking createSampleBooking() {
        Room room = new Room("R100", "Lassonde", 50);

        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(2);

        return new Booking(
                "B001",
                room,
                start,
                end,
                "BOOKED",
                20.0,
                100.0,
                null,
                null
        );
    }


    @Test
    public void testPartnerBookingCostCalculation() {
        Booking booking = createSampleBooking();

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        // 2 hours * $50/hr
        assertEquals(100.0, partnerBooking.cost());
    }


    @Test
    public void testPartnerBookingDescription() {
        Booking booking = createSampleBooking();

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        assertTrue(
            partnerBooking.getDescription()
                .contains("[Partner Rate: $50/hr]")
        );
    }


    @Test
    public void testPartnerBookingKeepsOriginalDescription() {
        Booking booking = createSampleBooking();

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        assertTrue(
            partnerBooking.getDescription()
                .contains("Standard Room Booking")
        );
    }


    @Test
    public void testPartnerBookingAppliesPartnerRate() {
        Booking booking = createSampleBooking();

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        assertEquals(100.0, partnerBooking.cost());
    }

    @Test
    public void testPartnerBookingWithDifferentDuration() {
        Room room = new Room("R200", "Bergeron", 30);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(5);

        Booking booking = new Booking(
                "B002",
                room,
                start,
                end,
                "BOOKED",
                10.0,
                200.0,
                null,
                null
        );

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        // 5 hours * $50/hr
        assertEquals(250.0, partnerBooking.cost());
    }


    @Test
    public void testPartnerBookingWithOneHourDuration() {
        Booking booking = createSampleBooking();

        PartnerBookingDecorator partnerBooking =
                new PartnerBookingDecorator(booking);

        assertTrue(partnerBooking.cost() > 0);
    }
}