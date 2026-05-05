package Facade;

public class Arbitru {
    private String nume;
    private boolean esteDisponibil;

    public Arbitru(String nume, boolean esteDisponibil) {
        this.nume = nume;
        this.esteDisponibil = esteDisponibil;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }
}
