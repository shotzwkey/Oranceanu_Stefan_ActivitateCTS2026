package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieSali {

    private List<Sala> listaSali = new ArrayList<>();

    public void addSala(Sala sala)
    {
        this.listaSali.add(sala);
    }

    public int getLocuriLibere(int nrInscrieri)
    {
        int contor = 0;
        for(Sala sala: listaSali)
        {
            if(sala.getNrLocuri() >= 1)
            {
                contor++;
            }
        }
        return contor;
    }
}
