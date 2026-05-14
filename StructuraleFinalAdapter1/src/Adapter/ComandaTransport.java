package Adapter;

public class ComandaTransport {
    private String destinatie;
    private double greutateKg;
    private int nrColete;

    public ComandaTransport(String destinatie, double greutateKg, int nrColete) {
        this.destinatie = destinatie;
        this.greutateKg = greutateKg;
        this.nrColete = nrColete;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public double getGreutateKg() {
        return greutateKg;
    }

    public int getNrColete() {
        return nrColete;
    }
}
