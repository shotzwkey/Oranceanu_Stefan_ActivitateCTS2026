package Decorator;

public class DecoratorYoga extends ADecoratorAbstract{

    public DecoratorYoga(AAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getAcces() {
        return super.getAcces() + " Acces Yoga";
    }

    @Override
    public int getPret() {
        return super.getPret() + 20;
    }
}
