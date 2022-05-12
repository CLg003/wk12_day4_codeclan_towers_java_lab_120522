import hotel.Hotel;
import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, RoomType.SINGLE);
        bedroom2 = new Bedroom(2, 2, RoomType.DOUBLE);
        bedroom3 = new Bedroom(4, 3, RoomType.FAMILY);
        conferenceRoom1 = new ConferenceRoom(10, "Boardroom", true);
        conferenceRoom2 = new ConferenceRoom(500, "Ballroom", false);
    }

    @Test
    public void hotelStartsWithZeroBedrooms(){
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddBedrooms(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hotelStartsWithZeroConferenceRooms(){
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddConferenceRooms(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }
}
