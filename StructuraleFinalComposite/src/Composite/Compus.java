package Composite;

import java.util.ArrayList;

public class Compus extends ANod{

    private ArrayList<ANod> compus = new ArrayList<>();
    private String numeCompus;

    public Compus(String numeCompus) {
        this.numeCompus = numeCompus;
    }

    public String getNumeCompus() {
        return this.numeCompus;
    }

    @Override
    public String getTitlu() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDurata() {
        int totalDurata = 0;
        for(ANod n: compus) {
            totalDurata += n.getDurata();
        }
        return totalDurata;
    }

    @Override
    public String getInfo() {

        String info = numeCompus + "\n";
        for(ANod n: compus)
        {
            info += " " + n.getInfo();
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod n) {
        compus.add(n);
    }

    @Override
    public void eliminaNod(ANod n) {
        compus.remove(n);
    }

    @Override
    public ANod getNod(int i) {
        return compus.get(i);
    }
}
