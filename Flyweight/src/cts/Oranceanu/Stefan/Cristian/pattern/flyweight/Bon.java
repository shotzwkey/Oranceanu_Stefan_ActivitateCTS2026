package cts.Oranceanu.Stefan.Cristian.pattern.flyweight;

public class Bon{
    //Bon este starea temporara din diagrama GoF
    private int nrMasa;
    private float costTotal;

    public Bon(int nrMasa, float costTotal) {
        super();
        this.nrMasa = nrMasa;
        this.costTotal = costTotal;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public float getCostTotal() {
        return costTotal;
    }


}