package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieArbitrii {

    private List<Arbitru> listaArbitrii = new ArrayList<>();

    public void addArbitru(Arbitru a) {
      this.listaArbitrii.add(a);
    }

    public int getArbitriDisponibili(int nrMeciuri) {
        int contor = 0;
        for (Arbitru a : listaArbitrii)
            if (a.isEsteDisponibil()) {
                contor++;
            }
        return contor;
    }

}
