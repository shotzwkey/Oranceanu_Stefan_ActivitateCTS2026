package Flyweight;

import java.util.HashMap;

public class FormatTichetFactory {
    private static HashMap<ETipLoc, IPrintareTichetJava> cache = new HashMap<>();

    private static int nrTicheteEmise = 0;


    public static IPrintareTichetJava getFormat(ETipLoc tip) {
        nrTicheteEmise++;

        IPrintareTichetJava format = cache.get(tip);

        if (format == null) {                       // pasul C — dacă nu există
            format = new FormatTichet(tip);         //           creezi
            cache.put(tip, format);                 //           și pui în cache
        }

        return format;
    }


    public static int getNrTicheteEmise() {
        return nrTicheteEmise;
    }
}
