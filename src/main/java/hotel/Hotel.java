package hotel;

import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
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

    public int getNumberOfDiningRooms() {
        return diningRooms.size();
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

    public void addDiningRoom(DiningRoom diningRoom){
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

}
