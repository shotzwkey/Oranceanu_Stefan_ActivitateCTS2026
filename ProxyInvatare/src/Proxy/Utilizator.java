package Proxy;

public class Utilizator {
    public String nume;
    public boolean esteAbonat;

    public Utilizator(String nume, boolean esteAbonat) {
        this.nume = nume;
        this.esteAbonat = esteAbonat;
    }

    public String getNume() {
        return nume;
    }

    public boolean esteAbonat() {
        return esteAbonat;
    }
}
