package cts.Oranceanu.Stefan.g1162.vapor.composite;

public class Colet implements IColet {
    private String denumire;
    private int greutate;
    private boolean fragil;

    public Colet(String denumire, int greutate, boolean fragil) {
        this.denumire = denumire;
        this.greutate = greutate;
        this.fragil = fragil;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getGreutate() {
        return greutate;
    }

    @Override
    public boolean esteFragil() {
        return fragil;
    }

    @Override
    public String getInfo(int nivel) {
        String tabs = "\t".repeat(nivel);
        return tabs + denumire + " | " + greutate + "kg" + (fragil ? " [FRAGIL]" : "");
    }
}