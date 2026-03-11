package ro.ase.cts.aplicatii;

public class AplicatieMobila2 {

    private String nume;
    private float dimensiune;
    private static AplicatieMobila2 instanta = new AplicatieMobila2("Aplicatia mea 2", 25);

    private AplicatieMobila2(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static synchronized AplicatieMobila2 getInstanta(){
        return instanta;
    }
}
