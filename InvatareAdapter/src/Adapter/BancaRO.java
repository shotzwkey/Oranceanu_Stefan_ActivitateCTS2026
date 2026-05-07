package Adapter;

public class BancaRO implements  IBancaRO{
    @Override
    public void proceseazaPlata(String numeClient, double suma, String moneda) {
        System.out.println("Plata s-a procesat:" + "Nume client: " + numeClient + ", " + "Suma: " + suma + " " + moneda);
    }


}
