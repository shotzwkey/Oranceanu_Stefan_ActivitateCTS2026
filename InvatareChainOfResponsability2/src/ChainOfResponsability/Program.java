package ChainOfResponsability;

public class Program {
    public static void main(String[] args) {

        VerificareParola h1 = new VerificareParola();
        VerificarePin h2 = new VerificarePin();
        VerificareIncredere h3 = new VerificareIncredere();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        Utilizator u1 = new Utilizator("Andrei", "parola123", 1234, true);
        Utilizator u2 = new Utilizator("Maria", "abc", 1234, true);
        Utilizator u3 = new Utilizator("Ion", "parola123", 12, true);
        Utilizator u4 = new Utilizator("Elena", "parola123", 1234, false);

        System.out.println(u1.getNume() + ": " + h1.Autentificare(u1));
        System.out.println(u2.getNume() + ": " + h1.Autentificare(u2));
        System.out.println(u3.getNume() + ": " + h1.Autentificare(u3));
        System.out.println(u4.getNume() + ": " + h1.Autentificare(u4));
    }
}