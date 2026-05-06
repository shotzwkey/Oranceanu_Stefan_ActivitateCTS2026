import java.util.ArrayList;
import java.util.List;

public class Grupa extends ANod{

    private List<ANod> copii = new ArrayList<>();
    private String numeGrupa;

    public Grupa(String numeGrupa) {
        this.numeGrupa = numeGrupa;
    }

    @Override
    public String getNume() {
        return numeGrupa;
    }

    @Override
    public int getCacheta() {
        int total = 0;
        for (ANod nod : copii) {
            total += nod.getCacheta();
        }
        return total;
    }


    @Override
    public String getInfo() {
        String info = numeGrupa +"\n";
        for(ANod nod: copii)
            info += " " + nod.getInfo() + "\n";
        return info;
    }

    @Override
    public void adaugaNod(ANod elementStructura) {
        copii.add(elementStructura);
    }

    @Override
    public void eliminaNod(ANod elementStructura) {
        copii.remove(elementStructura);
    }

    @Override
    public ANod getNod(int i) {
        return copii.get(i);
    }
}
