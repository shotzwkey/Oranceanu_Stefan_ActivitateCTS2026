package Facade;

public class Facade {
    private ColectieStudenti colectieStudenti = new ColectieStudenti();
    private ColectieSali colectieSali = new ColectieSali();

    public void addStudent(Student student)
    {
        colectieStudenti.addStudent(student);
    }

    public void addSala(Sala sala)
    {
        colectieSali.addSala(sala);
    }

    public boolean InscriereLaExamen(int nrInscrieri)
    {
        int contorStudenti = colectieStudenti.getNrStudentiPlatitori(nrInscrieri);
        int contorSali = colectieSali.getLocuriLibere(nrInscrieri);
        if(contorStudenti >= 1 && contorSali >= 1)
        {
            return true;
        }
        return false;
    }
}
