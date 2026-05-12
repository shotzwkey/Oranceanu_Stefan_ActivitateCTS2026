package Facade;

public class Program {
    public static void main(String[] args) {

        int nrParticipanti = 20;

        ColectieAutocare autocare = new ColectieAutocare();
        autocare.adaugaAutocare(new Autocar(true, "B-123-ABC"));
        autocare.adaugaAutocare(new Autocar(false, "CJ-456-DEF"));
        autocare.adaugaAutocare(new Autocar(true, "IS-789-GHI"));

        ColectieGhizi ghizi = new ColectieGhizi();
        ghizi.adaugaGhid(new Ghid("Andrei", true));
        ghizi.adaugaGhid(new Ghid("Maria", false));
        ghizi.adaugaGhid(new Ghid("Ion", true));
        ghizi.adaugaGhid(new Ghid("Elena", true));

        int contorAutocare = autocare.getDisponibilitateAutocar(0);
        int contorGhizi = ghizi.getDisponibilitateGhid(0);

        if (contorAutocare >= 1 && contorGhizi >= nrParticipanti / 10)
            System.out.println("Fara Facade: excursia poate pleca");
        else
            System.out.println("Fara Facade: excursia NU poate pleca");

        Facade facade = new Facade();
        facade.adaugaAutocare(new Autocar(true, "B-123-ABC"));
        facade.adaugaAutocare(new Autocar(false, "CJ-456-DEF"));
        facade.adaugaAutocare(new Autocar(true, "IS-789-GHI"));
        facade.adaugaGhid(new Ghid("Andrei", true));
        facade.adaugaGhid(new Ghid("Maria", false));
        facade.adaugaGhid(new Ghid("Ion", true));
        facade.adaugaGhid(new Ghid("Elena", true));

        System.out.println("Cu Facade: " + facade.verificaDisponibilitateExcursie(0, nrParticipanti));
    }
}