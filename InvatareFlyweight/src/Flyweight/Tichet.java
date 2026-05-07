package Flyweight;

public class Tichet {
    private String nrInmatriculare;
    private String oraSosire;

    public Tichet(String nrInmatriculare, String oraSosire) {
        this.nrInmatriculare = nrInmatriculare;
        this.oraSosire = oraSosire;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public String getOraSosire() {
        return oraSosire;
    }
}
