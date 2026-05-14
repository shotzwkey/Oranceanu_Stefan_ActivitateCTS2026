package Adapter;

public class Adapter_Clase extends SistemVechi implements ISistemNou{

    @Override
    public void proceseazaTransportNou(ComandaTransport comandaTransport) {
        this.proceseazaTransport(comandaTransport.getDestinatie(), comandaTransport.getGreutateKg(), comandaTransport.getNrColete());
    }
}
