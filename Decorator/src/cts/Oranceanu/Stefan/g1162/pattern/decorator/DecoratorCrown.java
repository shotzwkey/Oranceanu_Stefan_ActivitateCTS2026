package cts.Oranceanu.Stefan.g1162.pattern.decorator;

public class DecoratorCrown extends ADecoratorPizza {

    public DecoratorCrown(APizza pizza) {
        super(pizza);
        if (pizza instanceof DecoratorCrown) {
            throw new IllegalArgumentException("Nu se poate aplica DecoratorCrown peste un alt DecoratorCrown!");
        }
    }

    @Override
    String getComponente() {
        return super.getComponente() + ", margine cu branza";
    }

    @Override
    int getPret() {
        return super.getPret() + 10;
    }
}