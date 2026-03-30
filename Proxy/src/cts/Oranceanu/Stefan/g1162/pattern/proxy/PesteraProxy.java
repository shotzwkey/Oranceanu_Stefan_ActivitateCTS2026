package cts.Oranceanu.Stefan.g1162.pattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class PesteraProxy implements IPetrecere {
    private IPetrecere pestera;
    private List<Client> listaAsteptare = new ArrayList<>();
    private static final int GRUP_MINIM = 5;

    public PesteraProxy(IPetrecere pestera) {
        this.pestera = pestera;
    }

    @Override
    public void adaugaParticipant(Client cl) {
        listaAsteptare.add(cl);
        System.out.println("Clientul " + cl.getNume() + " asteapta. In lista: " + listaAsteptare.size() + "/" + GRUP_MINIM);

        if (listaAsteptare.size() == GRUP_MINIM) {
            System.out.println("S-au strans 5 persoane. Ghidul intra cu grupul in pestera");
            for (Client c : listaAsteptare) {
                pestera.adaugaParticipant(c);
            }
            listaAsteptare.clear();
        }
    }

    @Override
    public void afisareProgram() {
        pestera.afisareProgram();
    }
}
