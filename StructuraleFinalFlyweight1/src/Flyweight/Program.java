package Flyweight;

public class Program {
    public static void main(String[] args) {

        NotificareFlyweight.getMesajNotificare(ETipNotificare.LIKE).afiseazaNotificare(new Notificare("Andrei", 1));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.LIKE).afiseazaNotificare(new Notificare("Maria", 2));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.LIKE).afiseazaNotificare(new Notificare("Ion", 3));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.LIKE).afiseazaNotificare(new Notificare("Elena", 4));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.LIKE).afiseazaNotificare(new Notificare("Costel", 5));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.COMENTARIU).afiseazaNotificare(new Notificare("Gigel", 6));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.COMENTARIU).afiseazaNotificare(new Notificare("Relu", 7));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.COMENTARIU).afiseazaNotificare(new Notificare("Marian", 8));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.URMARIRE).afiseazaNotificare(new Notificare("Dana", 9));
        NotificareFlyweight.getMesajNotificare(ETipNotificare.URMARIRE).afiseazaNotificare(new Notificare("Mihai", 10));

        System.out.println("Notificari generate: " + NotificareFlyweight.getNrNotificariGenerate());
        System.out.println("Tipuri create in memorie: " + NotificareFlyweight.getNrTipuri());
    }
}