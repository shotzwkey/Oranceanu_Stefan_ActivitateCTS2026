public class Program {
    public static void main(String[] args) {

        Grupa festival = new Grupa("Festival de muzica");

        Grupa scena1 = new Grupa("Scena 1");
        Grupa scena2 = new Grupa("Scena 2");

        Grupa trupa1 = new Grupa("Trupa Voltaj");
        trupa1.adaugaNod(new Artist("Calin", 5000));
        trupa1.adaugaNod(new Artist("Mihai", 4000));

        Grupa trupa2 = new Grupa("Trupa Cargo");
        trupa2.adaugaNod(new Artist("Nelu", 6000));
        trupa2.adaugaNod(new Artist("Dan", 5500));

        scena1.adaugaNod(trupa1);
        scena1.adaugaNod(trupa2);

        Grupa trupa3 = new Grupa("Trupa Iris");
        trupa3.adaugaNod(new Artist("Cristi", 7000));
        trupa3.adaugaNod(new Artist("Relu", 4500));
        trupa3.adaugaNod(new Artist("Marian", 3500));

        scena2.adaugaNod(trupa3);
        scena2.adaugaNod(new Artist("Smiley", 10000));

        festival.adaugaNod(scena1);
        festival.adaugaNod(scena2);

        System.out.println(festival.getInfo());
        System.out.println("Cacheta totala festival: " + festival.getCacheta() + " lei");
    }
}