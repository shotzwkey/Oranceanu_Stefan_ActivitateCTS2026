package Strategy;

public class LivrareDrona implements IComanda{
    @Override
    public int calculeazaCost(int valoare) {
        return valoare / 10;
    }
}
