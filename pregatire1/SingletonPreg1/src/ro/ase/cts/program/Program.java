package ro.ase.cts.program;

import ro.ase.cts.masini.Masina;

public class Program {
    public static void main(String[] args) {
        // Testam Singleton-ul (Lazy)
        Masina m1 = Masina.getInstanta();
        Masina m2 = Masina.getInstanta();

        m2.setModel("Porsche");

        // Va afisa "Porsche" deoarece m1 si m2 sunt aceeasi instanta
        System.out.println(m1.getModel());
    }
}
