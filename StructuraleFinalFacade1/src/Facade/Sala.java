package Facade;

public class Sala {
    private int nrIdentificare;
    private int nrLocuri;

    public Sala(int nrIdentificare, int nrLocuri) {
        super();
        this.nrIdentificare = nrIdentificare;
        this.nrLocuri = nrLocuri;
    }

    public int getNrIdentificare() {
        return nrIdentificare;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }
}
