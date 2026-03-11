package ro.ase.cts.program;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.factory.FabricaAbstracta;
import ro.ase.cts.factory.SmartphoneFactory;

public class Program {

    private static void printareDispozitiv(FabricaAbstracta fabrica, int nivelBaterie){
        Dispozitiv dispozitiv = fabrica.creeareDispozitiv(nivelBaterie);
        System.out.println(dispozitiv.toString());
    }

    public static void main(String[] args) {
        printareDispozitiv(new SmartphoneFactory(), 50);
    }
}
