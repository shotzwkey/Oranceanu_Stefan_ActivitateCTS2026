package Composite;

public abstract class ANod {

    public abstract String getTitlu();
    public abstract int getDurata();

    public String getInfo()
    {
        return "Titlu: " + this.getTitlu() + ", Durata: " + this.getDurata();
    }

    public void adaugaNod(ANod n)
    {
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod n)
    {
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i)
    {
        throw new UnsupportedOperationException();
    }

}
