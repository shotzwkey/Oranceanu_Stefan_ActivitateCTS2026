package Facade;

public class Ghid {
    private String nume;
    private boolean esteDisponibil;

    public Ghid(String nume, boolean esteDisponibil) {
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
