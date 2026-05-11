package Decorator;

public class DecoratorPush extends ANotificareAbstracta{

    public DecoratorPush(ANotificare notificare) {
        super(notificare);
    }

    @Override
    String getMesaj() {
        return super.getMesaj() + ", trimis ca push notification";
    }

    @Override
    int getCost() {

        return super.getCost() + 3;
    }
}
