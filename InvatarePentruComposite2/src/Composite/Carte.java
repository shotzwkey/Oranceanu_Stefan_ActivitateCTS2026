package Composite;

public class Carte extends ANod{

    private String titlu;
    private int pret;

    public Carte(int pret, String titlu) {
        this.pret = pret;
        this.titlu = titlu;
    }

    @Override
    public String getTitlu() {
        return this.titlu;
    }

    @Override
    public int getPret() {
        return this.pret;
    }
}
