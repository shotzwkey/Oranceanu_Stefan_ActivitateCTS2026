package Facade;

public class Student {
    private String nume;
    private boolean taxaPlatita;

    public Student(String nume, boolean taxaPlatita) {
        super();
        this.nume = nume;
        this.taxaPlatita = taxaPlatita;
    }

    public String getNume() {
        return nume;
    }

    public boolean isTaxaPlatita() {
        return taxaPlatita;
    }
}
