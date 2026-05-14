package Adapter;

public class SistemVechi implements ISistemVechi{
    @Override
    public void proceseazaTransport(String destinatie, double greutateKg, int nrColete) {
        System.out.println("Procesare transport VECHI - destinatie: " + destinatie + ", greutate: " + greutateKg+ ", nrColete = " + nrColete );
    }
}
