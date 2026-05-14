package ChainOfResponsability;

public class Program {
    public static void main(String[] args) {

        VerificarePolita h1 = new VerificarePolita();
            VerificareTermen h2 = new VerificareTermen();
                 VerificareSuma h3 = new VerificareSuma();

        h1.setNextHandler(h2);
            h2.setNextHandler(h3);

        Cerere c1 = new Cerere("Ion Popescu", 30000, true, true);
         Cerere c2 = new Cerere("Maria Ionescu", 30000, false, true);
            Cerere c3 = new Cerere("Andrei Popa", 30000, true, false);
                Cerere c4 = new Cerere("Elena Dumitrescu", 60000, true, true);

        System.out.println(c1.getNumecClient() + ": " + h1.aprobareCerere(c1));
        System.out.println(c2.getNumecClient() + ": " + h1.aprobareCerere(c2));
        System.out.println(c3.getNumecClient() + ": " + h1.aprobareCerere(c3));
        System.out.println(c4.getNumecClient() + ": " + h1.aprobareCerere(c4));
    }
}