package Adapter;

public class Program {
    public static void main(String[] args) {

        ISistemVechi sistemVechi = new SistemVechi();
        sistemVechi.proceseazaTransport("Bucuresti", 15.5, 3);

        ISistemNou sistemNou = new SistemNou();
        ComandaTransport comanda1 = new ComandaTransport("Cluj", 20.0, 5);
        sistemNou.proceseazaTransportNou(comanda1);

        ComandaTransport comanda2 = new ComandaTransport("Timisoara", 8.3, 2);
        ISistemNou adapterObiecte = new Adapter_Obiecte(new SistemVechi());
        adapterObiecte.proceseazaTransportNou(comanda2);

        ComandaTransport comanda3 = new ComandaTransport("Iasi", 12.0, 4);
        ISistemNou adapterClase = new Adapter_Clase();
        adapterClase.proceseazaTransportNou(comanda3);
    }
}