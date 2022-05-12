import hotel.rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(10, "Boardroom", true);
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void startWithZeroGuests(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void hasName(){
        assertEquals("Boardroom", conferenceRoom.getName());
    }

    @Test
    public void hasAudioVisual(){
        assertEquals(true, conferenceRoom.getAudioVisual());
    }
}
