package Decorator;

public class DecoratorSMS extends ANotificareAbstracta{

    public DecoratorSMS(ANotificare notificare) {
        super(notificare);
    }

    @Override
    String getMesaj() {
        return super.getMesaj() + ", trimis pe SMS";
    }

    @Override
    int getCost() {

        return super.getCost() + 2;
    }
}
