package hotel.rooms;

public class ConferenceRoom extends Room{

    private String name;
    private Boolean audioVisual;

    public ConferenceRoom(int capacity, String name, Boolean audioVisual) {
        super(capacity);
        this.name = name;
        this.audioVisual = audioVisual;
    }

    public String getName() {
        return name;
    }

    public Boolean getAudioVisual() {
        return audioVisual;
    }
}
