package Facade;

public class Program {
    public static void main(String[] args) {

        ColectieTerene terene = new ColectieTerene();
        terene.addTeren(new Teren(1, true));
        terene.addTeren(new Teren(2, true));
        terene.addTeren(new Teren(3, true));
        terene.addTeren(new Teren(4, false));
        terene.addTeren(new Teren(5, false));

        ColectieArbitrii arbitri = new ColectieArbitrii();
        arbitri.addArbitru(new Arbitru("Popescu", true));
        arbitri.addArbitru(new Arbitru("Ionescu", true));
        arbitri.addArbitru(new Arbitru("Marinescu", false));
        arbitri.addArbitru(new Arbitru("Dumitrescu", false));

        int nrMeciuri = 4;
        int contorTerene = terene.getTerenuriLibere(nrMeciuri);
        int contorArbitri = arbitri.getArbitriDisponibili(nrMeciuri);

        if(contorTerene >= nrMeciuri && contorArbitri >= nrMeciuri / 2)
            System.out.println("Turneul poate incepe");
        else
            System.out.println("Turneul NU poate incepe");

        TurneuFacade facade = new TurneuFacade();
        facade.addTeren(new Teren(1, true));
        facade.addTeren(new Teren(2, true));
        facade.addTeren(new Teren(3, true));
        facade.addTeren(new Teren(4, false));
        facade.addTeren(new Teren(5, false));
        facade.addArbitru(new Arbitru("Popescu", true));
        facade.addArbitru(new Arbitru("Ionescu", true));
        facade.addArbitru(new Arbitru("Marinescu", false));
        facade.addArbitru(new Arbitru("Dumitrescu", false));

        System.out.println(facade.poateIncepeturneul(nrMeciuri));
    }
}