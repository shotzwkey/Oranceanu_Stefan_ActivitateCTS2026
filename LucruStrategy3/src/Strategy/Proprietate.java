package Strategy;

public class Proprietate {
    private String nume;
    private int pret;
    private int suprafata;

    public Proprietate(String nume, int pret, int suprafata) {
        this.nume = nume;
        this.pret = pret;
        this.suprafata = suprafata;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }

    public int getSuprafata() {
        return suprafata;
    }

    @Override
    public String toString() {
        return "Proprietate{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", suprafata=" + suprafata +
                '}';
    }
}
