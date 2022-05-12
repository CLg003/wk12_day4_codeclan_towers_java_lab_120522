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
    private ArrayList<RestaurantReservation> restaurantReservations;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
        this.restaurantReservations = new ArrayList<>();
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

    public void checkInGuestToRoom(Bedroom bedroom, Guest guest){
        if (bedroom.getNumberOfGuests() == 0){
            bedroom.addGuestToRoom(guest);
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

    public ArrayList<Bedroom> getVacantBedrooms() {
        ArrayList<Bedroom> vacantBedrooms = new ArrayList<>();
        for (Bedroom bedroom: bedrooms) {
            if (bedroom.getNumberOfGuests() == 0) {
                vacantBedrooms.add(bedroom);
            }
        }
        return vacantBedrooms;
    }

    public int getNumberOfRestaurantReservations(){
        return restaurantReservations.size();
    }

    public void createRestaurantReservation(DiningRoom diningRoom, Day day, double time, Guest guest, int numberOfCovers){
        RestaurantReservation reservation = new RestaurantReservation(diningRoom, day, time, guest, numberOfCovers);
        restaurantReservations.add(reservation);
    }

}
