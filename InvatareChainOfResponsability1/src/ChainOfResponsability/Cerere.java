package ChainOfResponsability;

public class Cerere {
    private String numecClient;
    private int suma;
    private boolean politaActiva;
    private boolean raportatTermen;

    public Cerere(String numecClient, int suma, boolean politaActiva, boolean raportatTermen) {
        this.numecClient = numecClient;
        this.suma = suma;
        this.politaActiva = politaActiva;
        this.raportatTermen = raportatTermen;
    }

    public String getNumecClient() {
        return numecClient;
    }

    public int getSuma() {
        return suma;
    }

    public boolean isPolitaActiva() {
        return politaActiva;
    }

    public boolean isRaportatTermen() {
        return raportatTermen;
    }

    @Override
    public String toString() {
        return "Cerere{" +
                "numecClient='" + numecClient + '\'' +
                ", suma=" + suma +
                ", politaActiva=" + politaActiva +
                ", raportatTermen=" + raportatTermen +
                '}';
    }
}
