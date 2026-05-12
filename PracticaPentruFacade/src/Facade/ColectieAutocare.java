package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieAutocare {

    private List<Autocar> listaAutocare = new ArrayList<>();

    public void adaugaAutocare(Autocar autocar)
    {
        this.listaAutocare.add(autocar);
    }

    public int getDisponibilitateAutocar(int nrDrumuri)
    {
        int contor = 0;
        for(Autocar autocar: listaAutocare) {
            if (autocar.isEsteDisponibil())
                contor++;
        }
        return contor;
    }
}
