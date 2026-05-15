package Strategy;

public class Comanda {

    private int valoare;
    private String metodaLivrare;

    public Comanda(int valoare, String metodaLivrare) {
        this.valoare = valoare;
        this.metodaLivrare = metodaLivrare;
    }

    public int getValoare() {
        return valoare;
    }

    public String getMetodaLivrare() {
        return metodaLivrare;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "valoare=" + valoare +
                ", metodaLivrare='" + metodaLivrare + '\'' +
                '}';
    }
}
