package Proxy;

public class Program {
    public static void main(String[] args) {

        IBiblioteca biblioteca = new BibliotecaDigitala();
        IBiblioteca bibliotecaProxy = new BibliotecaProxy(biblioteca);

        Utilizator u1 = new Utilizator("Andrei", true);
        Utilizator u2 = new Utilizator("Maria", false);
        Carte c1 = new Carte("Mihai Eminescu", "Luceafarul");
        Carte c2 = new Carte("Ion Creanga", "Amintiri din copilarie");

        bibliotecaProxy.imprumutaCarte(u1, c1);
        bibliotecaProxy.imprumutaCarte(u2, c2);

        bibliotecaProxy.afisareCarti();
        bibliotecaProxy.afisareCarti();
    }
}