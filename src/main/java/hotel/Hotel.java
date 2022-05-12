package hotel;

import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public int getNumberOfBedrooms(){
        return bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public int getNumberOfConferenceRooms(){
        return conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToRoom(Room room, Guest guest){
        if (room.getNumberOfGuests() < room.getCapacity()){
            room.addGuestToRoom(guest);
        }
    }

    public void checkOutGuestFromRoom(Room room, Guest guest){
        if (room.getGuests().contains(guest)){
            room.removeGuestFromRoom(guest);
        }
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
            Booking booking = new Booking(bedroom, numberOfNights);
            return booking;
    }

}
