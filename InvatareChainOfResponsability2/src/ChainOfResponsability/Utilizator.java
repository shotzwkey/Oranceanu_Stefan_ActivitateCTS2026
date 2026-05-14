package ChainOfResponsability;

public class Utilizator {
    private String nume;
    private String parola;
    private int PIN;
    private boolean deIncredere;

    public Utilizator(String nume, String parola, int PIN, boolean deIncredere) {
        this.nume = nume;
        this.parola = parola;
        this.PIN = PIN;
        this.deIncredere = deIncredere;
    }

    public String getNume() {
        return nume;
    }

    public String getParola() {
        return parola;
    }

    public int getPIN() {
        return PIN;
    }

    public boolean isDeIncredere() {
        return deIncredere;
    }

    @Override
    public String toString() {
        return "ChainOfResponsability.Utilizator{" +
                "nume='" + nume + '\'' +
                ", parola='" + parola + '\'' +
                ", PIN=" + PIN +
                ", deIncredere=" + deIncredere +
                '}';
    }
}
