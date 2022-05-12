import hotel.Guest;
import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 421, RoomType.SUITE, 150.00);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void startsWithZeroGuests(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(421, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SUITE, bedroom.getRoomType());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(150.00, bedroom.getNightlyRate(), 0.0);
    }
}
