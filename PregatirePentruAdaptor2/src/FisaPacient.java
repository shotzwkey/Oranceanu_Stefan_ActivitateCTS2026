public class FisaPacient {
    private String numePacient;
    private int varsta;
    private String diagnostic;

    public FisaPacient(String numePacient, int varsta, String diagnostic) {
        this.numePacient = numePacient;
        this.varsta = varsta;
        this.diagnostic = diagnostic;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public String getDiagnostic() {
        return diagnostic;
    }
}
