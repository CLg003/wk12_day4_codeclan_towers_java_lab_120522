package hotel.rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int capacity, int roomNumber, RoomType roomType, double nightlyRate){
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
