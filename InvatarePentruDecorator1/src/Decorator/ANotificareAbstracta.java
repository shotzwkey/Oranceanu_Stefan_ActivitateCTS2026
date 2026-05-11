package Decorator;

public abstract class ANotificareAbstracta extends ANotificare{

    protected ANotificare notificare;

    public ANotificareAbstracta(ANotificare notificare) {
        this.notificare = notificare;
    }

    @Override
    String getMesaj() {
        return notificare.getMesaj();
    }

    @Override
    int getCost() {
        return notificare.getCost();
    }
}
