package Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class BibliotecaDigitala implements IBiblioteca{

    private List<Carte> listaCarti;

    public BibliotecaDigitala() {
        this.listaCarti = new ArrayList<>();
        this.listaCarti.add(new Carte("Mihai Eminescu", "Luceafarul"));
        this.listaCarti.add(new Carte("Ion Creanga", "Amintiri din copilarie"));
        this.listaCarti.add(new Carte("Liviu Rebreanu", "Ion"));
    }

    @Override
    public void imprumutaCarte(Utilizator u, Carte c) {
        System.out.println("Utilizatorul " + u + " a imprumutat cartea" + c);
    }

    @Override
    public void afisareCarti() {
        System.out.println("Lista Carti" + listaCarti);
    }
}
