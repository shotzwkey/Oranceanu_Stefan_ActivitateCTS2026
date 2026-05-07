package Adapter;

public class Program {
    public static void main(String[] args) {

        BancaRO bancaRO = new BancaRO();
        bancaRO.proceseazaPlata("Ion Popescu", 500.0, "RON");

        Plata plata = new Plata("Ion Popescu", 500.0, "RON");
        IBancaEU bancaEU = new BancaEU();
        bancaEU.trimitePlata(plata);

        Plata plata2 = new Plata("Maria Ionescu", 1200.0, "EUR");
        IBancaEU adaptor = new AdaptorBanca(new BancaRO());
        adaptor.trimitePlata(plata2);
    }
}
