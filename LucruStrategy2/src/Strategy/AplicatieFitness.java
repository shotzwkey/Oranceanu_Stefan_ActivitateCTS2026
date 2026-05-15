package Strategy;

import java.util.ArrayList;

public class AplicatieFitness{
    private ArrayList<Exercitiu> listaExercitii = new ArrayList<>();
    private IExercitiu strategieAlegere;

    public void addExercitiu(Exercitiu exercitiu)
    {
        this.listaExercitii.add(exercitiu);
    }

    public void setStrategieAlegere(IExercitiu strategieAlegere) {
        this.strategieAlegere = strategieAlegere;
    }

    public Exercitiu alegereStrategie()
    {
        if(strategieAlegere != null)
        {
            return strategieAlegere.alegereExercitiu(listaExercitii);
        }
        else
            throw new UnsupportedOperationException();
    }
}
