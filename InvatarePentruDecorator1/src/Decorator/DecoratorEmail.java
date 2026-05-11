package Decorator;

public class DecoratorEmail extends ANotificareAbstracta{

    public DecoratorEmail(ANotificare notificare) {
        super(notificare);
    }

    @Override
    String getMesaj() {
        return super.getMesaj() + ", trimis pe email";
    }

    @Override
    int getCost() {

        return super.getCost() + 1;
    }
}
