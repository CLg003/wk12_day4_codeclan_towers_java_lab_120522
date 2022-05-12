package rooms;

public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    FAMILY(4),
    SUITE(2);

    private final int value;

    RoomType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
