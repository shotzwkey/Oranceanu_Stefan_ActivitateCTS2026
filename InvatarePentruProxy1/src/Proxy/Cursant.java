package Proxy;

public class Cursant {
    public String nume;
    public int nrCredite;

    public Cursant(String nume, int nrCredite) {
        this.nume = nume;
        this.nrCredite = nrCredite;
    }

    @Override
    public String toString() {
        return "Cursant [ " + "nume = " + nume + ", nrCredite = " + nrCredite + "]";
    }

    public int getNrCredite() {
        return nrCredite;
    }

    public String getNume() {
        return nume;
    }
}
