package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Smartphone;

public class SmartphoneFactory implements FabricaAbstracta{
    @Override
    public Dispozitiv creeareDispozitiv(int nivelBaterie) {
        return new Smartphone(nivelBaterie);
    }
}
