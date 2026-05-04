package Proxy;

public class BibliotecaProxy implements IBiblioteca{

    private IBiblioteca biblioteca;

    public BibliotecaProxy(IBiblioteca biblioteca) {
        super();
        this.biblioteca = biblioteca;
    }

    @Override
    public void imprumutaCarte(Utilizator u, Carte c) {
        if(u.esteAbonat == true)
            biblioteca.imprumutaCarte(u, c);
        else
            System.out.println("Utilizatorul "+u.getNume() + " nu este abonat");
    }

    @Override
    public void afisareCarti() {
        this.biblioteca.afisareCarti();
    }
}
