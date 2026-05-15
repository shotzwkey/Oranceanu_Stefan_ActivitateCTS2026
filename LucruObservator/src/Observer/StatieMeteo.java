package Observer;

import java.util.ArrayList;
import java.util.List;

public class StatieMeteo implements ISubiect{

    private String numeOras;
    private int temperatura;
    private List<IObserver> listaObservatori;

    public StatieMeteo(String numeOras) {
        this.numeOras = numeOras;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.listaObservatori.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.listaObservatori.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for(IObserver observer: listaObservatori)
            observer.getMesaj(mesaj);
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        this.notifyAll("Temperatura in orasul: " + numeOras + " este acum: " + temperatura + " grade");
    }
}
