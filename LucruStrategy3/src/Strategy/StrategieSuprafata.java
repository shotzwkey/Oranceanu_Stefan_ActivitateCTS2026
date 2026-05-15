package Strategy;

import java.util.ArrayList;

public class StrategieSuprafata implements IProprietate{
    @Override
    public Proprietate sortareProprietate(ArrayList<Proprietate> listaProprietati) {
        Proprietate proprietateSuprafata = listaProprietati.get(0);
        for(Proprietate proprietate: listaProprietati)
        {
            if(proprietate.getSuprafata() > proprietateSuprafata.getSuprafata())
            {
                proprietateSuprafata = proprietate;
            }
        }
        return proprietateSuprafata;
    }
}
