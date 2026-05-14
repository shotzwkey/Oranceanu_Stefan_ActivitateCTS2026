package ChainOfResponsability;

public abstract class AHandler{
    protected AHandler nextHandler;

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean aprobareCerere(Cerere cerere);
}
