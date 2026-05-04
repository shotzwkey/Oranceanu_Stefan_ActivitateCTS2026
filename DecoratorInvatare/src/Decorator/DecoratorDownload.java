package Decorator;

public class DecoratorDownload extends AbstractAbonament{
    private int descarcare;

    public DecoratorDownload(IAbonament abonament) {
        super(abonament);
        this.descarcare = descarcare;
    }

    @Override
    public String getDetalii() {
        return super.getDetalii() + "' descarcare" + this.descarcare;
    }

    @Override
    public int getPretLunar() {
        return super.getPretLunar() + 5;
    }
}
