package hotel;

import hotel.rooms.DiningRoom;

public class RestaurantReservation {

    private DiningRoom diningRoom;
    private Day day;
    private double time;
    private Guest guest;
    private int numberOfCovers;

    public RestaurantReservation(DiningRoom diningRoom, Day day, double time, Guest guest, int numberOfCovers){
        this.diningRoom = diningRoom;
        this.day = day;
        this.time = time;
        this.guest = guest;
        this.numberOfCovers = numberOfCovers;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public Day getDay() {
        return day;
    }

    public double getTime() {
        return time;
    }

    public int getNumberOfCovers() {
        return numberOfCovers;
    }
}
