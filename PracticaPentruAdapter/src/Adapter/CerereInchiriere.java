package Adapter;

public class CerereInchiriere {
    private String numeClient;
    private int nrZile;
    private String categorie;

    public CerereInchiriere(String numeClient, int nrZile, String categorie) {
        this.numeClient = numeClient;
        this.nrZile = nrZile;
        this.categorie = categorie;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrZile() {
        return nrZile;
    }

    public String getCategorie() {
        return categorie;
    }
}
