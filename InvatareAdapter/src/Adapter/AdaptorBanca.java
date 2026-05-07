package Adapter;

public class AdaptorBanca implements IBancaEU{

    private IBancaRO bancaRO;

    public AdaptorBanca(IBancaRO bancaRO) {
        this.bancaRO = bancaRO;
    }

    @Override
    public void trimitePlata(Plata plata) {
        bancaRO.proceseazaPlata(plata.getNumeClient(), plata.getSuma(), plata.getMoneda());
    }


}
