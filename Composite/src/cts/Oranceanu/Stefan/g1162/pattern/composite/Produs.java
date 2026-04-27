package cts.Oranceanu.Stefan.g1162.pattern.composite;

public class Produs implements INodFrunza {
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getPret() {
        return pret;
    }

    @Override
    public String getInfo(int nivel) {
        String tabs = "\t".repeat(nivel);
        return tabs + denumire + " - " + pret + " RON";
    }
}