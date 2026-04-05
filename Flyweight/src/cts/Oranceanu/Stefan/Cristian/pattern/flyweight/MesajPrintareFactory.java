package cts.Oranceanu.Stefan.Cristian.pattern.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MesajPrintareFactory {
    private static HashMap<ETipPrintare, IPrintare> listaMesaje = new HashMap<>();
    private static int nrBonuriPrintate = 0;
    private static List<InregistrariPrintare> istoricPrintari = new ArrayList<>();

    public static IPrintare getMesajPrintare(ETipPrintare tipPrintare) {
        nrBonuriPrintate++;
        IPrintare mesajPrintare = listaMesaje.get(tipPrintare);
        if (mesajPrintare == null) {
            mesajPrintare = new MesajPrintare(tipPrintare);
            listaMesaje.put(tipPrintare, mesajPrintare);
        }
        return mesajPrintare;
    }

    public static void inregistreazaPrintare(ETipPrintare tipPrintare, Bon bon) {
        istoricPrintari.add(new InregistrariPrintare(tipPrintare, bon.getNrMasa(), bon.getCostTotal()));
    }

    public static void afiseazaIstoricPrintari() {
        System.out.println("\n=== ISTORIC PRINTARI ===");
        for (InregistrariPrintare inregistrare : istoricPrintari) {
            System.out.println(inregistrare);
        }
        System.out.println("========================\n");
    }

    public static float getTotalCosturiPrintate() {
        float total = 0;
        for (InregistrariPrintare inregistrare : istoricPrintari) {
            total += inregistrare.getCostTotal();
        }
        return total;
    }

    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }

    public static int getNrMatriteBonuri() {
        return listaMesaje.size();
    }
}