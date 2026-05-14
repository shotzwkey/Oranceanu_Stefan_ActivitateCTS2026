package Flyweight;

public class MesajNotificare implements INotificare{

    private ETipNotificare tipNotificare;
    private String culoare;
    private String textFormatare;

    public MesajNotificare(ETipNotificare tipNotificare) {
        this.tipNotificare = tipNotificare;
    }

    public ETipNotificare getTipNotificare() {
        return tipNotificare;
    }

    @Override
    public void afiseazaNotificare(Notificare notificare) {
        System.out.println("Afisare notificare: Tipul de notificare este: " + this.getTipNotificare() + ", destinatarul este: " + notificare.getDestinatar() + ", timestamp: " + notificare.getTimestamp());
    }
}
