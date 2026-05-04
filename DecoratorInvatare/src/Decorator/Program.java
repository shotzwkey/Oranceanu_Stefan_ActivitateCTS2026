package Decorator;

public class Program {
    public static void main(String[] args) {
        IAbonament abonament = new AbonamentDeVaza();
        System.out.println(abonament.getDetalii());
        System.out.println(abonament.getPretLunar());

        IAbonament abonamentDecorat = new DecoratorHD(new AbonamentDeVaza() ,10);
        System.out.println(abonamentDecorat.getDetalii());
        System.out.println(abonamentDecorat.getPretLunar());

    }
}
