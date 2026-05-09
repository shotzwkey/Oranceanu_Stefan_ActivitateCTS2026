package Adapter;

public class AutoEU implements IAutoEU{

    @Override
    public void inchiriazaEU(CerereInchiriere cerereInchiriere) {
        System.out.println("AutoEU: inchiriere pentru " + cerereInchiriere.getNumeClient());
    }
}
