package Strategy;

public class Exercitiu {
    private String nume;
    private int nrCaloriiArse;
    private int durata;

    public Exercitiu(String nume, int nrCaloriiArse, int durata) {
        this.nume = nume;
        this.nrCaloriiArse = nrCaloriiArse;
        this.durata = durata;
    }

    public String getNume() {
        return nume;
    }

    public int getNrCaloriiArse() {
        return nrCaloriiArse;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Exercitiu{" +
                "nume='" + nume + '\'' +
                ", nrCaloriiArse=" + nrCaloriiArse +
                ", durata=" + durata +
                '}';
    }
}
