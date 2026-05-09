package Adapter;

public class Adaptor_Obiect implements IAutoEU {

    private IAutoRO autoRO;

    public Adaptor_Obiect(IAutoRO autoRO) {
        this.autoRO = autoRO;
    }

    @Override
    public void inchiriazaEU(CerereInchiriere cerereInchiriere) {
        System.out.println("Se implementeaza adaptorul:");
        this.autoRO.inchiriaza(cerereInchiriere.getNumeClient(), cerereInchiriere.getNrZile(), cerereInchiriere.getCategorie());
    }
}
