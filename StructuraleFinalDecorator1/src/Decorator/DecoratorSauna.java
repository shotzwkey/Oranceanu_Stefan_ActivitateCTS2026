package Decorator;

public class DecoratorSauna extends  ADecoratorAbstract{

    public DecoratorSauna(AAbonament abonament) {
        super(abonament);
    }

    @Override
    public String getAcces() {
        return super.getAcces() + " Acces sauna";
    }

    @Override
    public int getPret() {
        return super.getPret() + 15;
    }
}
