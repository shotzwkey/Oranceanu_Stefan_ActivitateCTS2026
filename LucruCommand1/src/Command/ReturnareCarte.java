package Command;

public class ReturnareCarte implements IGestiune {

    private String titlu;
    private SistemGestiune sistemGestiune;

    public ReturnareCarte(String titlu, SistemGestiune sistemGestiune) {
        super();
        this.titlu = titlu;
        this.sistemGestiune = sistemGestiune;
    }

    @Override
    public void proceseaza() {
        this.sistemGestiune.returneazaCarte(titlu);
    }
}
