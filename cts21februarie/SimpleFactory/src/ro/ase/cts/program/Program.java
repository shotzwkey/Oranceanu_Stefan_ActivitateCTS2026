package ro.ase.cts.program;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.factory.FabricaDispozitive;
import ro.ase.cts.factory.TipDispozitiv;

public class Program {
    public static void main(String[] args) {
        FabricaDispozitive fabrica = FabricaDispozitive.getInstanta();
        Dispozitiv laptop = fabrica.getDispozitiv(TipDispozitiv.Laptop, 80);
        Dispozitiv telefon = fabrica.getDispozitiv(TipDispozitiv.Smartphone, 73);
        Dispozitiv smartwatch = fabrica.getDispozitiv(TipDispozitiv.Smartwatch, 50);

        System.out.println(laptop.toString());
        System.out.println(telefon.toString());
        System.out.println(smartwatch.toString());

    }
}
