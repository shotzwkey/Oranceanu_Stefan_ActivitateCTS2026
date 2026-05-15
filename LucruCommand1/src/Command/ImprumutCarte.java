package Command;

public class ImprumutCarte implements IGestiune {

    private String titlu;
    private String numeCititor;
    private SistemGestiune sistemGestiune;

    public ImprumutCarte(String titlu, String numeCititor, SistemGestiune sistemGestiune) {
        this.titlu = titlu;
        this.numeCititor = numeCititor;
        this.sistemGestiune = sistemGestiune;
    }

    @Override
    public void proceseaza() {
        this.sistemGestiune.imprumutaCarte(titlu, numeCititor);
    }
}
