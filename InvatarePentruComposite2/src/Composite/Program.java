package Composite;

public class Program {
    public static void main(String[] args) {
        Colectie colectie1 = new Colectie("Capra cu trei iezi");
        colectie1.adaugaNod(new Carte(20, "Iedul 1"));
        colectie1.adaugaNod(new Carte(25, "Iedul 2"));
        colectie1.adaugaNod(new Carte(30, "Iedul 3"));

        Colectie colectie2 = new Colectie("Aventurile lui Jack");
        colectie2.adaugaNod(new Carte(25, "Plecat in America"));
        colectie2.adaugaNod(new Carte(45, "Pierdut in Spania"));
        colectie2.adaugaNod(new Carte(50, "Fara bani in Pipera"));

        System.out.println("Cost total Capra cu trei iezi: " + colectie1.getPret() + "lei");
        System.out.println("Aventurile lui Jack: " + colectie2.getPret() + "lei");

        System.out.println(colectie1.getInfo());
        System.out.println(colectie2.getInfo());

    }
}
