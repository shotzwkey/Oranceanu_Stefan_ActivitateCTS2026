package Decorator;

public abstract class AbstractAbonament implements IAbonament{
    protected IAbonament abonament;

    public AbstractAbonament(IAbonament abonament) {
        super();
        this.abonament = abonament;
    }


    @Override
    public String getDetalii() {
        return abonament.getDetalii();
    }

    @Override
    public int getPretLunar() {
        return abonament.getPretLunar();
    }
}
