package cts.Oranceanu.Stefan.Cristian.pattern.flyweight;

public class Program {

    public static void main(String[] args) {
        Bon bon1 = new Bon(10, 410);
        Bon bon2 = new Bon(5, 230);
        Bon bon3 = new Bon(3, 175);

        for (int i = 0; i < 100; i++) {
            MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP1).printareBon(bon1);
            MesajPrintareFactory.inregistreazaPrintare(ETipPrintare.TIP1, bon1);
        }

        for (int i = 0; i < 50; i++) {
            MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP2).printareBon(bon2);
            MesajPrintareFactory.inregistreazaPrintare(ETipPrintare.TIP2, bon2);
        }

        for (int i = 0; i < 25; i++) {
            MesajPrintareFactory.getMesajPrintare(ETipPrintare.TIP3).printareBon(bon3);
            MesajPrintareFactory.inregistreazaPrintare(ETipPrintare.TIP3, bon3);
        }

        System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
        System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");

        MesajPrintareFactory.afiseazaIstoricPrintari();

        System.out.println("Total costuri inregistrate: " + MesajPrintareFactory.getTotalCosturiPrintate() + " RON");
    }
}