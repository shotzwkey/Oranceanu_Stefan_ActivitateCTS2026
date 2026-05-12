package Proxy;

public class Document {
    public String titlu;
    public boolean confidential;

    public Document(String titlu, boolean confidential) {
        this.titlu = titlu;
        this.confidential = confidential;
    }

    @Override
    public String toString() {
        return "Document [ " + "titlu = " + titlu + ", confidential = " + confidential + "]";
    }

    public String getTitlu() {
        return titlu;
    }

    public boolean isConfidential() {
        return confidential;
    }
}
