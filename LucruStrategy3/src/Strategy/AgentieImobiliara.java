package Strategy;

import java.util.ArrayList;

public class AgentieImobiliara {

    private ArrayList<Proprietate> listaProprietati = new ArrayList<>();
    private IProprietate strategieProprietate;

    public void addProprietate(Proprietate proprietate)
    {
        this.listaProprietati.add(proprietate);
    }

    public void setStrategieProprietate(IProprietate strategieProprietate) {
        this.strategieProprietate = strategieProprietate;
    }

    public Proprietate alegereStrategie()
    {
        if(strategieProprietate != null)
        {
           return strategieProprietate.sortareProprietate(listaProprietati);
        }
        else
            throw new UnsupportedOperationException();
    }
}
