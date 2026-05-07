package Adapter;

public class Plata {

    private String numeClient;
    private double suma;
    private String moneda;

    public Plata(String numeClient, double suma, String moneda) {
        this.numeClient = numeClient;
        this.suma = suma;
        this.moneda = moneda;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getSuma() {
        return suma;
    }

    public String getMoneda() {
        return moneda;
    }
}