package Adapter;

public class Adapter_Obiecte implements ISistemNou{

    private ISistemVechi sistemVechi;

    public Adapter_Obiecte(ISistemVechi sistemVechi) {
        this.sistemVechi = sistemVechi;
    }

    @Override
    public void proceseazaTransportNou(ComandaTransport comandaTransport) {
        this.sistemVechi.proceseazaTransport(comandaTransport.getDestinatie(), comandaTransport.getGreutateKg(), comandaTransport.getNrColete());
    }
}
