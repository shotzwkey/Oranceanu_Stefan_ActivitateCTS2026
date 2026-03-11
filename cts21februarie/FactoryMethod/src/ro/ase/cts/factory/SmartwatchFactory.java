package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Smartwatch;

public class SmartwatchFactory implements FabricaAbstracta{
    @Override
    public Dispozitiv creeareDispozitiv(int nivelBaterie) {
        return new Smartwatch(nivelBaterie);
    }
}
