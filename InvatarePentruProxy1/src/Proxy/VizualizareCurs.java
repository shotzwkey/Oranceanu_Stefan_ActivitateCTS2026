package Proxy;

import java.util.ArrayList;
import java.util.List;

public class VizualizareCurs implements IPlatforma{

    private List<String> catalog;
    private List<Cursant> listaCursanti;

    public VizualizareCurs(List<String> catalog) {
        this.catalog = catalog;
        this.listaCursanti = new ArrayList<>();
    }

    @Override
    public void vizualizeazaCurs(Cursant cursant, String numeCurs) {
        this.listaCursanti.add(cursant);
        System.out.println("A fost adaugat cursantul: " + cursant.getNume() + " pentru cursul: " + numeCurs);
    }

    @Override
    public void afiseazaCatalog() {
        System.out.println("Catalogul cu cursuri disponibile este: ");
        for( String disponibil: catalog)
            System.out.println(" " + disponibil);
    }
}
