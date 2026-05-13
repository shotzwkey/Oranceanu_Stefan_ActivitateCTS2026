package Flyweight;

public class Caracter {
    private int linie;
    private int coloana;

    public Caracter(int linie, int coloana) {
        this.linie = linie;
        this.coloana = coloana;
    }

    public int getLinie() {
        return linie;
    }

    public int getColoana() {
        return coloana;
    }
}
