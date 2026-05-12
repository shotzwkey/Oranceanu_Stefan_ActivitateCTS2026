package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieGhizi {
    private List<Ghid> listaGhizi = new ArrayList<>();

    public void adaugaGhid(Ghid ghid)
    {
        this.listaGhizi.add(ghid);
    }

    public int getDisponibilitateGhid(int nrDrumuri)
    {
        int contor = 0;
        for(Ghid ghid: listaGhizi) {
            if (ghid.isEsteDisponibil())
                contor++;
        }
        return contor;
    }
}
