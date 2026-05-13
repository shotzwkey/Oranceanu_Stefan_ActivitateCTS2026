package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Clinica implements IClinica {

    private List<String> listaFise;
    private List<FisaMedicala> fise;

    public Clinica(List<String> listaFise) {
        this.listaFise = listaFise;
        this.fise = new ArrayList<>();

    }

    @Override
    public void vizualizareFisa(FisaMedicala fisaMedicala, Animal animal, Medic medic) {
       this.fise.add(fisaMedicala);
        System.out.println("Fisa vizualizata: " + fisaMedicala + " | Animal: " + animal);
    }

    @Override
    public void listareFise() {
        System.out.println("Listare fise: ");
        for(String listare: listaFise)
            System.out.println(" " + listare);
    }
}


