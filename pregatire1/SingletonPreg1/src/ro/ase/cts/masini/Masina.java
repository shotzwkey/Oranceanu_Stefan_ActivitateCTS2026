package ro.ase.cts.masini;

public class Masina {

    private String model;
    private float pret;
    private static Masina instanta = null;

    private Masina(String model, float pret) {
        this.model = model;
        this.pret = pret;
    }

    public void setModel(String nouModel) {
        this.model = nouModel;
    }

    public String getModel() {
        return this.model;
    }

    public static synchronized Masina getInstanta() {
        if (instanta == null) {
            instanta = new Masina("Dacia Logan", 15000);
        }
        return instanta;
    }
}