package Flyweight;

import java.util.HashMap;

public class Flyweight {

    private static HashMap<EStil, ICaracter> cache = new HashMap<>();

    private static int nrGenerate = 0;

    public static ICaracter getCaracter(EStil stil)
    {
        nrGenerate++;

        ICaracter caracter = cache.get(stil);

        if(caracter == null)
        {
            caracter = new genStil(stil);
            cache.put(stil, caracter);
        }
        return caracter;
    }

    public static int getNrTipuri() {
        return cache.size();
    }

    public static int getNrGenerate() {
        return nrGenerate;
    }
}
