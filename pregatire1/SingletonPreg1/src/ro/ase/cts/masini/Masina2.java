package ro.ase.cts.masini;

public class Masina2 {

    private String model;
    private float pret;
    private static Masina2 instanta = new Masina2("Tesla Model 3", 45000);

    private Masina2(String model, float pret) {
        this.model = model;
        this.pret = pret;
    }

    public static synchronized Masina2 getInstanta() {
        return instanta;
    }
}
