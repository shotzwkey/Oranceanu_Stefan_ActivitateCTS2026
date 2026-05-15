package Strategy;

public class LivrareStandard implements  IComanda {

    @Override
    public int calculeazaCost(int valoare) {
        return 15;
    }
}