package Observer;

public class PanouAfisaj implements IObserver{

    private String numeOras;

    public PanouAfisaj(String numeOras) {
        super();
        this.numeOras = numeOras;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("[Panou - " + this.numeOras + " ]"+ mesaj);
    }
}
