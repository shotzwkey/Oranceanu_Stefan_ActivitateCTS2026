package Decorator;

public class DecoratorEcrane extends AbstractAbonament {
    private int nrEcrane;

    public DecoratorEcrane(IAbonament abonament, int nrEcrane) {
        super(abonament);
        this.nrEcrane = nrEcrane;
    }

    @Override
    public String getDetalii() {
        return super.getDetalii() + "2" + this.nrEcrane;
    }

    @Override
    public int getPretLunar() {
        return super.getPretLunar() + ( 6 * (this.nrEcrane));
    }
}
