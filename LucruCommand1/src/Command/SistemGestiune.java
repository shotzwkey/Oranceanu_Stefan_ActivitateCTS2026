package Command;

public class SistemGestiune {

    private String numeSistem;

    public SistemGestiune(String numeSistem) {
        this.numeSistem = numeSistem;
    }

    public void imprumutaCarte(String titlu, String numeCititor)
    {
        System.out.println("Sistemul; " + numeSistem + " a imprumutat cartea: " + titlu + " cititorului " + numeCititor);
    }

    public void returneazaCarte(String titlu)
    {
        System.out.println("Sistemul; " + numeSistem + " a returnat cartea: " + titlu);
    }
}
