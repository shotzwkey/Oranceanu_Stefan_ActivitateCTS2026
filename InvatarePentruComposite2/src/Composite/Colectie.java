package Composite;

import java.util.ArrayList;

public class Colectie extends ANod{

    private String titlu;
    private ArrayList<ANod> copii = new ArrayList<>();

    public Colectie(String titlu) {
        this.titlu = titlu;
    }

    @Override
    public String getTitlu() {
     return this.titlu;
    }

    @Override
    public int getPret() {
      int pret = 0;
      for(ANod n: copii)
      {
          pret += n.getPret();
      }
      return pret;
    }

    @Override
    public String getInfo() {
        String info = titlu + "\n";
        for(ANod n: copii)
        {
            info += " " + n.getInfo() + "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod n) {
      copii.add(n);
    }

    @Override
    public void eliminaNod(ANod n) {
       copii.remove(n);
    }

    @Override
    public ANod getNod(int i) {
        return copii.get(i);
    }
}
