package Adapter;

public class AutoRO implements  IAutoRO{
    @Override
    public void inchiriaza(String numeClient, int nrZile, String categorie) {
        System.out.println("AutoRO: inchiriere pentru " + numeClient + ", " + nrZile + " zile, categorie: " + categorie);
    }
}
