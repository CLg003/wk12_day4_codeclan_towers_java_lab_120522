import hotel.Booking;
import hotel.Guest;
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
    Guest guest1;
    Guest guest2;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, RoomType.SINGLE, 100.00);
        bedroom2 = new Bedroom(2, 2, RoomType.DOUBLE, 150.00);
        bedroom3 = new Bedroom(4, 3, RoomType.FAMILY, 180.00);
        conferenceRoom1 = new ConferenceRoom(10, "Boardroom", true);
        conferenceRoom2 = new ConferenceRoom(500, "Ballroom", false);
        guest1 = new Guest("Graeme");
        guest2 = new Guest("Jack");
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

    @Test
    public void canCheckGuestsIntoRooms(){
        hotel.checkInGuestToRoom(bedroom1, guest1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canCheckGuestsOutOfRooms(){
        hotel.checkInGuestToRoom(conferenceRoom1, guest1);
        hotel.checkInGuestToRoom(conferenceRoom1, guest2);
        hotel.checkOutGuestFromRoom(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.getNumberOfGuests());
    }

    @Test
    public void canCreateBooking(){
        hotel.addBedroom(bedroom1);
        Booking booking = hotel.bookRoom(bedroom1, 2);
        assertEquals(2, booking.getNumberOfNights());
        assertEquals(bedroom1, booking.getBedroom());
    }
}
