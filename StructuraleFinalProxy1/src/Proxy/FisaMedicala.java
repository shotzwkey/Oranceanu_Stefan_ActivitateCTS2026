package Proxy;

public class FisaMedicala {

    private String numeAnimal;
    private String diagnostic;

    public FisaMedicala(String numeAnimal, String diagnostic) {
        this.numeAnimal = numeAnimal;
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "FisaMedicala [ " + "nume = " + numeAnimal + ", diagnostic = " + diagnostic + "]";
    }

    public String getNume() {
        return numeAnimal;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
