package Facade;

public class TurneuFacade {
    private ColectieArbitrii colectieArbitrii = new ColectieArbitrii();
    private ColectieTerene colectieTerene = new ColectieTerene();

    public void addArbitru(Arbitru a)
    {
        colectieArbitrii.addArbitru(a);
    }

    public void addTeren(Teren t)
    {
        colectieTerene.addTeren(t);
    }

    public boolean poateIncepeturneul(int nrMeciuri)
    {
        int contorArbitrii = colectieArbitrii.getArbitriDisponibili(nrMeciuri);
        int contorTerene = colectieTerene.getTerenuriLibere(nrMeciuri);

        if((contorTerene >= nrMeciuri) && (contorArbitrii >= nrMeciuri / 2))
        {
            return true;
        }
        return false;
    }
}
