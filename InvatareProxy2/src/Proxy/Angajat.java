package Proxy;

public class Angajat {
    public String nume;
    public boolean rolSenior;

    public Angajat(String nume, boolean rolSenior) {
        this.nume = nume;
        this.rolSenior = rolSenior;
    }

    @Override
    public String toString() {
        return "Angajat [ " + "nume = " + nume + ", rolSenior = " + rolSenior + "]";
    }

    public String getNume() {
        return nume;
    }

    public boolean isRolSenior() {
        return rolSenior;
    }
}
