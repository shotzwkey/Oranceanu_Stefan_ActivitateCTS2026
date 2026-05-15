package Observator;

public class Program {
    public static void main(String[] args) {

        ReteaMagazine retea = new ReteaMagazine("Emag");

        Client c1 = new Client("Andrei", "andrei@email.com");
        Client c2 = new Client("Maria", "maria@email.com");
        Client c3 = new Client("Ion", "ion@email.com");

        retea.addObservator(c1);
        retea.addObservator(c2);
        retea.addObservator(c3);

        retea.adaugaProdus("Laptop Lenovo");

        retea.removeObservator(c1);

        retea.aplicaReducere(20);
    }
}