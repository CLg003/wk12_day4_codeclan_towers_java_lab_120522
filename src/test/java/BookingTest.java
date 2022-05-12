import hotel.Booking;
import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(2, 3, RoomType.DOUBLE);
        booking = new Booking(bedroom1, 3);
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom1, booking.getBedroom());
    }

    @Test
    public void bookingHasNumberOfNights(){
        assertEquals(3, booking.getNumberOfNights());
    }

}
