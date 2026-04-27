package cts.Oranceanu.Stefan.g1162.pattern.composite;

public class Meniu {
    private Structura structura;
    private String numeRestaurant;

    public Meniu(Structura structura, String numeRestaurant) {
        this.structura = structura;
        this.numeRestaurant = numeRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getInfo() {
        return structura.getInfo(0);
    }
}