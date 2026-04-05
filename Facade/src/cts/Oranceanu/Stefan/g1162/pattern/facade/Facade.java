package cts.Oranceanu.Stefan.g1162.pattern.facade;

public class Facade {
    private ColectieBucatari colectieBucatari = new ColectieBucatari();
    private ColectieOspatari colectieOspatari = new ColectieOspatari();
    private ColectieSali colectieSali = new ColectieSali();

    public void addBucatar(Bucatar bucatar) {
        colectieBucatari.addBucatar(bucatar);
    }

    public void addOspatar(Ospatar ospatar) {
        colectieOspatari.addOspatar(ospatar);
    }

    public void addSala(SalaEveniment sala) {
        colectieSali.addSala(sala);
    }

    public boolean verificaDisponibilitateData(String data, int nrPersoane) {
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariData(data);
        boolean salaOk = colectieSali.existaSalaDisponibilaData(data, nrPersoane);

        if (contorOspatari >= nrPersoane / 5 && contorBucatari >= nrPersoane / 20 && salaOk) {
            return true;
        } else {
            return false;
        }
    }
}