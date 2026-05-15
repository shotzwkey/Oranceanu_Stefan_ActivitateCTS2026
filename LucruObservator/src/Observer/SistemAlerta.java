package Observer;

public class SistemAlerta implements IObserver{

    private int temperatura;

    public SistemAlerta(int temperatura) {
        super();
        this.temperatura = temperatura;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Sistemul de alerta cu temperatura: " + this.temperatura + " a primit mesajul: " + mesaj);
    }
}
