package Strategy;

import java.util.ArrayList;

public class StrategiePret implements IProprietate{
    @Override
    public Proprietate sortareProprietate(ArrayList<Proprietate> listaProprietati) {
        Proprietate proprietatePret = listaProprietati.get(0);
        for(Proprietate proprietate: listaProprietati)
        {
            if(proprietate.getPret() < proprietatePret.getPret())
            {
                proprietatePret = proprietate;
            }
        }
        return  proprietatePret;
    }
}
