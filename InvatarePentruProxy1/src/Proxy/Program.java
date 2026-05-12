package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> catalog = new ArrayList<>();
        catalog.add("Java pentru incepatori");
        catalog.add("Design Patterns");
        catalog.add("Baze de date");

        IPlatforma platforma = new VizualizareCurs(catalog);

        Cursant c1 = new Cursant("Andrei", 20);
        Cursant c2 = new Cursant("Maria", 5);
        Cursant c3 = new Cursant("Ion", 10);

        platforma.vizualizeazaCurs(c1, "Java pentru incepatori");
        platforma.afiseazaCatalog();

        IPlatforma proxy = new VizualizareCursProxy(platforma);

        proxy.vizualizeazaCurs(c1, "Design Patterns");
        proxy.vizualizeazaCurs(c2, "Baze de date");
        proxy.vizualizeazaCurs(c3, "Java pentru incepatori");

        proxy.afiseazaCatalog();
    }
}