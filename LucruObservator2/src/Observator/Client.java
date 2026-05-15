package Observator;

public class Client implements IObservator{
    private String nume;
    private String email;

    public Client(String nume, String email) {
        this.nume = nume;
        this.email = email;;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul: " + nume + ", cu emailul: " + email + "a primit mesajul: " + mesaj);
    }
}
