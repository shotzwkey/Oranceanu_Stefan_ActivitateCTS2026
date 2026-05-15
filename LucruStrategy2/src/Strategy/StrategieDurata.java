package Strategy;

import java.util.ArrayList;

public class StrategieDurata implements IExercitiu{
    @Override
    public Exercitiu alegereExercitiu(ArrayList<Exercitiu> listaExercitii) {
        Exercitiu exercitiuDurataScurta = listaExercitii.get(0);
        for(Exercitiu exercitiu: listaExercitii) {
            if (exercitiu.getDurata() < exercitiuDurataScurta.getDurata()) {
                exercitiuDurataScurta = exercitiu;
            }
        }
        return exercitiuDurataScurta;
    }
}
