package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> listaFise = new ArrayList<>();
        listaFise.add("Fisa - Rex - caine");
        listaFise.add("Fisa - Whiskers - pisica");
        listaFise.add("Fisa - Tweety - pasare");

        IClinica clinica = new Clinica(listaFise);

        Animal a1 = new Animal("Rex", "caine");
        Animal a2 = new Animal("Whiskers", "pisica");
        FisaMedicala f1 = new FisaMedicala("Rex", "otita");
        FisaMedicala f2 = new FisaMedicala("Whiskers", "raceala");

        Medic medicSpecializat = new Medic(true);
        Medic medicNespecializat = new Medic(false);

        clinica.vizualizareFisa(f1, a1, medicSpecializat);
        clinica.listareFise();

        IClinica proxy = new ClinicaProxy(clinica);

        proxy.vizualizareFisa(f1, a1, medicSpecializat);
        proxy.vizualizareFisa(f2, a2, medicNespecializat);
        proxy.listareFise();
    }
}