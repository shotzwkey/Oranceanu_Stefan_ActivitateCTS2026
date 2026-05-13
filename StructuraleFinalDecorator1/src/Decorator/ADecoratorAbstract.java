package Decorator;

public class ADecoratorAbstract extends AAbonament{

    protected AAbonament abonament;

    public ADecoratorAbstract(AAbonament abonament) {
        this.abonament = abonament;
    }

    @Override
    public String getAcces() {
        return abonament.getAcces();
    }

    @Override
    public int getPret() {
        return abonament.getPret();
    }
}
