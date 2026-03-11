package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;

public interface FabricaAbstracta {
    Dispozitiv creeareDispozitiv(int nivelBaterie);
}
