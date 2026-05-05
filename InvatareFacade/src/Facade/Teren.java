package Facade;

public class Teren {
    private int numar;
    private boolean esteLiber;

    public Teren(int numar, boolean esteLiber) {
        this.numar = numar;
        this.esteLiber = esteLiber;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isEsteLiber() {
        return esteLiber;
    }
}
