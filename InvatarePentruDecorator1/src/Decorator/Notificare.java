package Decorator;

public class Notificare extends ANotificare{

    private String mesaj;
    private int cost;

    public Notificare(String mesaj, int cost) {
        this.mesaj = mesaj;
        this.cost = cost;
    }

    @Override
    String getMesaj() {
        return this.mesaj;
    }

    @Override
    int getCost() {
        return this.cost;
    }
}
