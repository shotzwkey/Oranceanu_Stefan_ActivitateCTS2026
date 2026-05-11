package Composite;

import java.util.ArrayList;

public class Grupa extends ANod {

    private String nume;
    private ArrayList<ANod> copii = new ArrayList<>();

    public Grupa(String nume) {
        this.nume = nume;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getSuprafata() {
        int total = 0;
        for (ANod n : copii)
            total += n.getSuprafata();
        return total;
    }

    @Override
    public String getInfo() {
        String info = nume + "\n";
        for (ANod n : copii)
            info += "  " + n.getInfo() + "\n";
        return info;
    }

    @Override
    public void adaugaNod(ANod n)
    {
        copii.add(n);
    }

    @Override
    public void eliminaNod(ANod n)
    {
        copii.remove(n);
    }

    @Override
    public ANod getNod(int i)
    {
        return copii.get(i);
    }
}