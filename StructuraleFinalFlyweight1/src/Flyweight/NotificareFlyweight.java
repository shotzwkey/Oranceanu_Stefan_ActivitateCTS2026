package Flyweight;

import java.util.HashMap;

public class NotificareFlyweight {

    private static HashMap<ETipNotificare, INotificare> listaNotificari = new HashMap<>();
    private static int nrNotificariGenerate = 0;

    public static INotificare getMesajNotificare(ETipNotificare tipNotificare)
    {
        nrNotificariGenerate++;
        INotificare mesajNotificare = listaNotificari.get(tipNotificare);
        if(mesajNotificare == null)
        {
            mesajNotificare = new MesajNotificare(tipNotificare);
            listaNotificari.put(tipNotificare, mesajNotificare);
        }
        return mesajNotificare;
    }

    public static int getNrNotificariGenerate() {
        return nrNotificariGenerate;
    }

    public static int getNrTipuri()
    {
        return listaNotificari.size();
    }
}
