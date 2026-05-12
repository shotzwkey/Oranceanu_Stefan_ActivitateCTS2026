package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> folderDocumente = new ArrayList<>();
        folderDocumente.add("document1");
        folderDocumente.add("document2");
        folderDocumente.add("document3");

        ISistem sistem = new Sistem(folderDocumente);

        Document d1 = new Document("d1", true);
        Document d2 = new Document("d2", false);
        Document d3 = new Document("d3", true);

        Angajat a1 = new Angajat("Andrei", true);
        Angajat a2 = new Angajat("Mihai", false);
        Angajat a3 = new Angajat("Stefan", false);

        sistem.descarcaDocument(a1, d1);
        sistem.listeazaDocumente();

        ISistem proxy = new SistemProxy(sistem);

        proxy.descarcaDocument(a1, d1);
        proxy.descarcaDocument(a2, d1);
        proxy.descarcaDocument(a3, d1);

        proxy.listeazaDocumente();
    }
}