package Facade;

import java.util.ArrayList;
import java.util.List;

public class ColectieStudenti{

    private List<Student> listaStudenti = new ArrayList<>();

    public void addStudent(Student student)
    {
        this.listaStudenti.add(student);
    }

    public int getNrStudentiPlatitori(int nrInscrieri)
    {
        int contor =0;
        for(Student student: listaStudenti)
        {
            if(student.isTaxaPlatita())
            {
                contor++;
            }
        }
        return contor;
    }
}
