package Composite;

public class Program {
    public static void main(String[] args) {

        Grupa proiect = new Grupa("Proiect Imobiliar Nord");

        Grupa cladire1 = new Grupa("Cladirea A");
        cladire1.adaugaNod(new Apartament("Apt 1", 65));
        cladire1.adaugaNod(new Apartament("Apt 2", 70));
        cladire1.adaugaNod(new Apartament("Apt 3", 55));

        Grupa cladire2 = new Grupa("Cladirea B");
        cladire2.adaugaNod(new Apartament("Apt 1", 80));
        cladire2.adaugaNod(new Apartament("Apt 2", 90));

        proiect.adaugaNod(cladire1);
        proiect.adaugaNod(cladire2);

        System.out.println("Suprafata Cladirea A: " + cladire1.getSuprafata() + "mp");
        System.out.println("Suprafata Cladirea B: " + cladire2.getSuprafata() + "mp");
        System.out.println("Suprafata totala proiect: " + proiect.getSuprafata() + "mp");

        System.out.println();
        System.out.println(proiect.getInfo());
    }
}