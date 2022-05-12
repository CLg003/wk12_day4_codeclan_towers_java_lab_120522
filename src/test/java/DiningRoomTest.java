import hotel.rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(30, "Dining Room");
    }

    @Test
    public void diningRoomHasName(){
        assertEquals("Dining Room", diningRoom.getName());
    }
}
