package Decorator;

public class DecoratorPiscina extends ADecoratorAbstract{

    public DecoratorPiscina(AAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getAcces() {
        return super.getAcces() + " Acces Psicina";
    }

    @Override
    public int getPret() {
        return super.getPret() + 30;
    }
}
