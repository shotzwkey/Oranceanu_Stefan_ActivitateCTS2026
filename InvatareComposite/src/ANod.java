public abstract class ANod {
    public abstract String getNume();
    public abstract int getCacheta();

    public String getInfo()
    {
        return this.getNume() + " - " + this.getCacheta() + " lei";
    }

    public void adaugaNod(ANod elementStructura)
    {
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elementStructura)
    {
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i)
    {
        throw new UnsupportedOperationException();
    }
}
