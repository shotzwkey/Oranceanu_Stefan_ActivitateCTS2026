package Adapter;

public class BancaEU implements  IBancaEU{
    @Override
    public void trimitePlata(Plata plata) {
        System.out.println("Se proceseaza plata din obiectul primit: " + plata);
    }
}
