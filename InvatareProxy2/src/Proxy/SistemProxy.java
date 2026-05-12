package Proxy;

public class SistemProxy implements ISistem{

    private ISistem sistem;

    public SistemProxy(ISistem sistem) {
        this.sistem = sistem;
    }

    @Override
    public void descarcaDocument(Angajat angajat, Document document) {
        if((document.isConfidential()) && (angajat.isRolSenior()) )
        {
            sistem.descarcaDocument(angajat, document);
            System.out.println("Documentul: " + document.getTitlu() + " poate fi descarcat de angajatul: " + angajat.getNume());
        }

        else if ((document.isConfidential()) && (!angajat.isRolSenior())) {
            System.out.println("Documentul: " + document.getTitlu() + " NU poate fi descarcat de angajatul: " + angajat.getNume());
        }

        else if (!document.isConfidential()) {
            sistem.descarcaDocument(angajat, document);
            System.out.println("Documentul: " + document.getTitlu() + " poate fi descarcat de orice angajat");
        }

    }

    @Override
    public void listeazaDocumente() {
        System.out.println("Listarea documenteleor:");
        this.sistem.listeazaDocumente();
    }
}
