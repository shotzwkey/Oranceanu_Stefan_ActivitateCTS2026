package Strategy;

public class LivrareRapida implements IComanda{
    @Override
    public int calculeazaCost(int valoare) {
        return 30;
    }
}
