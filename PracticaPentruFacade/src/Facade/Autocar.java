package Facade;

public class Autocar {
    private String nrInmatriculare;
    private boolean esteDisponibil;

    public Autocar(boolean esteDisponibil, String nrInmatriculare) {
        this.esteDisponibil = esteDisponibil;
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }
}
