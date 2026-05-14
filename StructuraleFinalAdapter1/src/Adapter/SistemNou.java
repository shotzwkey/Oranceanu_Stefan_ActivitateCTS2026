package Adapter;

public class SistemNou implements ISistemNou{
    @Override
    public void proceseazaTransportNou(ComandaTransport comandaTransport) {
        System.out.println("Procesare transport NOU - destinatie: " + comandaTransport.getDestinatie() + ", greutate: " + comandaTransport.getGreutateKg() + ", nrColete = " + comandaTransport.getNrColete() );
    }
}
