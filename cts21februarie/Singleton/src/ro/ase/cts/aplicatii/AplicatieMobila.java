package ro.ase.cts.aplicatii;

public class AplicatieMobila {

    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta=null;

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public void setNume(String nouNume) {
        this.nume = nouNume;
    }

    public String getNume() {
        return this.nume;
    }

    public static synchronized AplicatieMobila getInstanta(){
        if(instanta==null){
            instanta = new AplicatieMobila("Aplicatia mea", 25);
        }
        return instanta;
    }
}
