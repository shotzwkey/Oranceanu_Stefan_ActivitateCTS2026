package Proxy;

import java.util.ArrayList;
import java.util.List;

public class Sistem implements ISistem{

    private List<String> folderDocumente;
    private List<Document> documente;
    private List<Angajat> angajati;

    public Sistem(List<String> folderDocumente) {
        this.folderDocumente = folderDocumente;
        this.documente = new ArrayList<>();
        this.angajati = new ArrayList<>();
    }

    @Override
    public void descarcaDocument(Angajat angajat, Document document) {
        this.documente.add(document);
        System.out.println("Angajatul: " + angajat.getNume() + " a descarcat documentul: " + document.getTitlu());
    }

    @Override
    public void listeazaDocumente() {
        System.out.println("Acestea sunt documentele listate: ");
        for(String listare : folderDocumente)
        {
            System.out.println(" " + listare);
        }
    }
}
