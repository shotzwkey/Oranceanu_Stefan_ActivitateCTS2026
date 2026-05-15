package Observator;

import java.util.ArrayList;
import java.util.List;

public class ReteaMagazine implements ISubiect{

    private String numeProdus;
    private int reducere;
    private List<IObservator> listaObservatori;

    public ReteaMagazine(String numeProdus) {
        this.numeProdus = numeProdus;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void addObservator(IObservator observator) {
        this.listaObservatori.add(observator);
    }

    @Override
    public void removeObservator(IObservator observator) {
        this.listaObservatori.remove(observator);
    }

    @Override
    public void notifyAll(String mesaj) {
        for(IObservator observator: listaObservatori)
            observator.getMesaj(mesaj);
    }

    public void adaugaProdus(String numeProdus)
    {
        this.notifyAll("Produs nou: " + numeProdus);
    }

    public void aplicaReducere(int reducere)
    {
      this.notifyAll("Reducere de: " + reducere + " %!");
    }
}
