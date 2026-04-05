package cts.Oranceanu.Stefan.g1162.pattern.facade;

public class Ospatar {
    private String nume;
    private boolean esteOcupat;

    public Ospatar(String nume, boolean esteOcupat) {
        this.nume = nume;
        this.esteOcupat = esteOcupat;
    }

    public String getNume() {
        return nume;
    }

    public Ospatar setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public boolean isEsteOcupat() {
        return esteOcupat;
    }

    public Ospatar setEsteOcupat(boolean esteOcupat) {
        this.esteOcupat = esteOcupat;
        return this;
    }
}