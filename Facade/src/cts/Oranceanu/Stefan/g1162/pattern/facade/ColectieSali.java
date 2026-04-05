package cts.Oranceanu.Stefan.g1162.pattern.facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieSali {
    private List<SalaEveniment> listaSali = new ArrayList<>();

    public void addSala(SalaEveniment sala) {
        this.listaSali.add(sala);
    }

    public boolean existaSalaDisponibilaData(String data, int nrPersoane) {
        for (SalaEveniment sala : listaSali) {
            if (!sala.isEsteOcupata() && sala.getCapacitate() >= nrPersoane) {
                return true;
            }
        }
        return false;
    }
}