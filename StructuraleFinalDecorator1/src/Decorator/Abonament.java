package Decorator;

public class Abonament extends AAbonament{

    @Override
    public String getAcces() {
        return "Acees la sala de forta";
    }

    @Override
    public int getPret() {
        return 50;
    }
}
