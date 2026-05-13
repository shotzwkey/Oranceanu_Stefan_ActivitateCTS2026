package Composite;

public class Melodie extends ANod{


    private String titlu;
    private int durata;

    public Melodie(String titlu, int durata) {
        this.titlu = titlu;
        this.durata = durata;
    }

    @Override
    public String getTitlu() {
        return this.titlu;
    }

    @Override
    public int getDurata() {
        return this.durata;
    }
}
