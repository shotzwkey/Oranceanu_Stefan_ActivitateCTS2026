package Composite;

public abstract class ANod {

    public abstract String getTitlu();
    public abstract int getPret();

    public String getInfo()
    {
        return this.getTitlu() + " " + this.getPret();
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
