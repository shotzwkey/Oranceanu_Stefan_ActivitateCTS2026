package Facade;

public class Facade {
   private ColectieAutocare colectieAutocare = new ColectieAutocare();
   private ColectieGhizi colectieGhizi = new ColectieGhizi();

    public void adaugaAutocare(Autocar autocar)
    {
        colectieAutocare.adaugaAutocare(autocar);
    }

    public void adaugaGhid(Ghid ghid)
    {
     colectieGhizi.adaugaGhid(ghid);
    }

    public boolean verificaDisponibilitateExcursie(int nrDrumuri, int participanti)
    {
        int contorAutocare = colectieAutocare.getDisponibilitateAutocar(nrDrumuri);
        int contorGhizi = colectieGhizi.getDisponibilitateGhid(nrDrumuri);
        if(contorAutocare >= 1 && contorGhizi >= participanti / 10)
        {
            return true;
        }
        return false;
    }

}
