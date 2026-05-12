package Proxy;

public class VizualizareCursProxy implements IPlatforma{

    private IPlatforma platforma;

    public VizualizareCursProxy(IPlatforma platforma) {
        super();
        this.platforma = platforma;
    }

    @Override
    public void vizualizeazaCurs(Cursant cursant, String numeCurs) {
        if(cursant.getNrCredite() >= 10)
        {
            platforma.vizualizeazaCurs(cursant, numeCurs);
        }
        else
        {
            System.out.println("Cursantul " + cursant.getNume() + " nu are numarul necesar de credite.");
        }
    }

    @Override
    public void afiseazaCatalog() {
        this.platforma.afiseazaCatalog();
    }
}
