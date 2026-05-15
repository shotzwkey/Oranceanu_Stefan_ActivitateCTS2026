package Command;

public class Program {
    public static void main(String[] args) {

        SistemGestiune sistem = new SistemGestiune("Biblioteca Centrala");

        IGestiune c1 = new ImprumutCarte("Morometii", "Andrei Popescu", sistem);
        IGestiune c2 = new ImprumutCarte("Ion", "Maria Ionescu", sistem);
        IGestiune c3 = new ReturnareCarte("Enigma Otiliei", sistem);

        Bibliotecar bibliotecar = new Bibliotecar();
        bibliotecar.preiaCartea(c1);
        bibliotecar.preiaCartea(c2);
        bibliotecar.preiaCartea(c3);

        bibliotecar.duceCartile();
    }
}