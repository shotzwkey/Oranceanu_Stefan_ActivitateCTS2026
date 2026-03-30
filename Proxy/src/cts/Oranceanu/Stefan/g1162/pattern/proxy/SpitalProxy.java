package cts.Oranceanu.Stefan.g1162.pattern.proxy;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class SpitalProxy implements IPetrecere {
    private IPetrecere spital;

    private Map<String, String> vizitariZilnice = new HashMap<>();

    public SpitalProxy(IPetrecere spital) {
        this.spital = spital;
    }

    @Override
    public void adaugaParticipant(Client cl) {
        LocalTime ora = LocalTime.now();
        LocalTime start = LocalTime.of(18, 0);
        LocalTime end = LocalTime.of(20, 0);

        if (ora.isBefore(start) || ora.isAfter(end)) {
            System.out.println("Vizitatorul " + cl.getNume() + " nu poate intra. Interval permis: 18:00-20:00");
            return;
        }


        String pacient = "pacient" + cl.getNume();

        if (vizitariZilnice.containsKey(pacient)) {
            System.out.println("Vizitatorul " + cl.getNume() + " nu poate intra. Pacientul a fost deja vizitat azi.");
            return;
        }

        vizitariZilnice.put(pacient, cl.getNume());
        spital.adaugaParticipant(cl);
    }

    @Override
    public void afisareProgram() {
        spital.afisareProgram();
    }
}