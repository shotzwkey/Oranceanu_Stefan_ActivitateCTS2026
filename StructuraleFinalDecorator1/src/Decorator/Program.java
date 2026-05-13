package Decorator;

public class Program {
    public static void main(String[] args) {

        AAbonament abonamentSimple = new Abonament();
        System.out.println(abonamentSimple.getAcces());
        System.out.println(abonamentSimple.getPret() + " lei");

        AAbonament abonamentPiscina = new DecoratorPiscina(new Abonament());
        System.out.println(abonamentPiscina.getAcces());
        System.out.println(abonamentPiscina.getPret() + " lei");

        AAbonament abonamentComplet = new DecoratorSauna(new DecoratorYoga(new DecoratorPiscina(new Abonament())));
        System.out.println(abonamentComplet.getAcces());
        System.out.println(abonamentComplet.getPret() + " lei");
    }
}