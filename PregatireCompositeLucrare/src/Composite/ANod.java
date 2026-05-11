package Composite;

public abstract class ANod {

    public abstract String getNume();
    public abstract int getSuprafata();

    public String getInfo() {
        return getNume() + " " + getSuprafata() + "mp";
    }

    public void adaugaNod(ANod n)
    { throw new UnsupportedOperationException();
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