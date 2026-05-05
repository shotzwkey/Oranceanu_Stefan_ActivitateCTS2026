package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieTerene {
    private List<Teren> listaTerene = new ArrayList<>();

    public void addTeren(Teren t)
    {
        this.listaTerene.add(t);
    }

    public int getTerenuriLibere(int nrMeciuri)
    {
        int contor = 0;
        for(Teren t: listaTerene)
            if(t.isEsteLiber())
            {
                contor++;
            }
        return contor;
    }
}
