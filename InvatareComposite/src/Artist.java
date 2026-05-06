public class Artist extends ANod {
    private String nume;
    private int cacheta;

    public Artist(String nume, int cacheta) {
        this.nume = nume;
        this.cacheta = cacheta;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getCacheta() {
        return this.cacheta;
    }
}
