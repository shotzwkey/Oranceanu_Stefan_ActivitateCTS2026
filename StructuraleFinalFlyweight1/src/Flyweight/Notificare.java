package Flyweight;

public class Notificare {
    private String destinatar;
    private int timestamp;

    public Notificare(String destinatar, int timestamp) {
        super();
        this.destinatar = destinatar;
        this.timestamp = timestamp;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public int getTimestamp() {
        return timestamp;
    }
}
