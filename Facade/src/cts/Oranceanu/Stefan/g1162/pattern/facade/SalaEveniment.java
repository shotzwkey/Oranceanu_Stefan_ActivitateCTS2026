package cts.Oranceanu.Stefan.g1162.pattern.facade;

public class SalaEveniment {
    private String nume;
    private int capacitate;
    private boolean esteOcupata;

    public SalaEveniment(String nume, int capacitate, boolean esteOcupata) {
        this.nume = nume;
        this.capacitate = capacitate;
        this.esteOcupata = esteOcupata;
    }

    public String getNume() {
        return nume;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public boolean isEsteOcupata() {
        return esteOcupata;
    }
}