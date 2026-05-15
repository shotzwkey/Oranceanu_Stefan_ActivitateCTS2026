package Strategy;

public class AplicatieLivrari {
    private int valoare;
    private IComanda comandaAlegere;

    public void setComandaAlegere(IComanda comandaAlegere) {
        this.comandaAlegere = comandaAlegere;
    }

    public AplicatieLivrari(int valoare) {
        this.valoare = valoare;
    }

    public int alegereComada()
    {
        if(comandaAlegere != null)
        {
            return comandaAlegere.calculeazaCost(valoare);
        }
        else
            throw new UnsupportedOperationException();
    }
}
