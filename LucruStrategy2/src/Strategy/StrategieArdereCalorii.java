package Strategy;

import java.util.ArrayList;

public class StrategieArdereCalorii implements IExercitiu{
    @Override
    public Exercitiu alegereExercitiu(ArrayList<Exercitiu> listaExercitii) {
        Exercitiu exercitiuCalorii = listaExercitii.get(0);
        for(Exercitiu exercitiu: listaExercitii)
        {
            if (exercitiu.getNrCaloriiArse() > exercitiuCalorii.getNrCaloriiArse())
            {
                exercitiuCalorii = exercitiu;
            }
        }
        return  exercitiuCalorii;
    }
}
