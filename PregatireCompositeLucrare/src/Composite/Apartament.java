package Composite;

public class Apartament extends ANod {
    private String nume;
    private int suprafata;

    public Apartament(String nume, int suprafata) {
        this.nume = nume;
        this.suprafata = suprafata;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getSuprafata() {
        return suprafata;
    }
}