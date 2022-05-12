import hotel.Day;
import hotel.Guest;
import hotel.RestaurantReservation;
import hotel.rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantReservationTest {

    RestaurantReservation reservation;
    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom(25, "Lounge Bar");
        guest = new Guest("Alex");
        reservation = new RestaurantReservation(diningRoom, Day.TUESDAY, 19.00, guest, 3);
    }

    @Test
    public void reservationHasDiningRoom(){
        assertEquals(diningRoom, reservation.getDiningRoom());
    }

    @Test
    public void reservationHasDay(){
        assertEquals(Day.TUESDAY, reservation.getDay());
    }

    @Test
    public void reservationHasTime(){
        assertEquals(19.00, reservation.getTime(), 0.0);
    }

    @Test
    public void reservationHasNumberOfCovers(){
        assertEquals(3, reservation.getNumberOfCovers());
    }
}
