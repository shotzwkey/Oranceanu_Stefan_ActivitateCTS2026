package Facade;

public class Program {
    public static void main(String[] args) {

        ColectieStudenti studenti = new ColectieStudenti();
        studenti.addStudent(new Student("Andrei", true));
        studenti.addStudent(new Student("Maria", false));

        ColectieSali sali = new ColectieSali();
        sali.addSala(new Sala(101, 30));
        sali.addSala(new Sala(102, 0));

        int contorStudenti = studenti.getNrStudentiPlatitori(0);
        int contorSali = sali.getLocuriLibere(0);

        if (contorStudenti >= 1 && contorSali >= 1)
            System.out.println("Fara Facade: inscrierea este posibila");
        else
            System.out.println("Fara Facade: inscrierea NU este posibila");

        Facade facade = new Facade();
        facade.addStudent(new Student("Andrei", true));
        facade.addStudent(new Student("Maria", false));
        facade.addSala(new Sala(101, 30));
        facade.addSala(new Sala(102, 0));

        System.out.println("Cu Facade: " + facade.InscriereLaExamen(0));
    }
}