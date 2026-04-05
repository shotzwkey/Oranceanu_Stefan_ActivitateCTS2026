package cts.Oranceanu.Stefan.g1162.pattern.facade;

public class Program {
    public static void main(String[] args) {

        ColectieBucatari colectieBucatari = new ColectieBucatari();
        colectieBucatari.addBucatar(new Bucatar("Gigel1", true));
        colectieBucatari.addBucatar(new Bucatar("Gigel2", false));
        colectieBucatari.addBucatar(new Bucatar("Gigel3", false));
        colectieBucatari.addBucatar(new Bucatar("Gigel4", true));

        ColectieOspatari colectieOspatari = new ColectieOspatari();
        colectieOspatari.addOspatar(new Ospatar("Costel1", true));
        colectieOspatari.addOspatar(new Ospatar("Costel2", false));
        colectieOspatari.addOspatar(new Ospatar("Costel3", false));
        colectieOspatari.addOspatar(new Ospatar("Costel4", true));

        String data = "12/12/2020";
        int nrPersoanePetrecere = 100;
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariData(data);
        if (contorOspatari >= nrPersoanePetrecere / 5 && contorBucatari >= nrPersoanePetrecere / 20) {
            System.out.println("Se poate tine petrecerea atunci");
        } else {
            System.out.println("NU se poate tine petrecerea atunci");
        }

        Facade facade = new Facade();
        facade.addBucatar(new Bucatar("Gigel1", true));
        facade.addBucatar(new Bucatar("Gigel2", true));
        facade.addBucatar(new Bucatar("Gigel3", false));
        facade.addBucatar(new Bucatar("Gigel4", true));
        facade.addBucatar(new Bucatar("Gigel5", true));
        facade.addOspatar(new Ospatar("Costel1", false));
        facade.addOspatar(new Ospatar("Costel2", false));
        facade.addOspatar(new Ospatar("Costel3", false));
        facade.addOspatar(new Ospatar("Costel4", false));
        facade.addOspatar(new Ospatar("Costel5", false));
        facade.addOspatar(new Ospatar("Costel6", false));
        facade.addOspatar(new Ospatar("Costel7", false));
        facade.addSala(new SalaEveniment("Sala Mare", 200, false));
        facade.addSala(new SalaEveniment("Sala Mica", 50, false));

        System.out.println(facade.verificaDisponibilitateData("12/12/2020", 100));
    }
}