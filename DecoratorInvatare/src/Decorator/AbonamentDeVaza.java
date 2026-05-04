package Decorator;

public class AbonamentDeVaza implements IAbonament{

    @Override
    public String getDetalii() {
        return "acces standard, SD";
    }

    @Override
    public int getPretLunar() {
        return 15;
    }
}
