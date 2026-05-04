package Decorator;

public class DecoratorHD extends AbstractAbonament{
    private int HD;

    public DecoratorHD(IAbonament abonament, int HD) {
        super(abonament);
        this.HD = HD;
    }

    @Override
    public String getDetalii() {
        return super.getDetalii() + ", HD" + this.HD ;
    }

    @Override
    public int getPretLunar() {
        return super.getPretLunar() + 8 ;
    }
}
