package Strategy;

public class Program {
    public static void main(String[] args) {

        AplicatieLivrari aplicatie = new AplicatieLivrari(200);

        aplicatie.setComandaAlegere(new LivrareStandard());
        System.out.println("Livrare standard: " + aplicatie.alegereComada() + " lei");

        aplicatie.setComandaAlegere(new LivrareRapida());
        System.out.println("Livrare rapida: " + aplicatie.alegereComada() + " lei");

        aplicatie.setComandaAlegere(new LivrareDrona());
        System.out.println("Livrare drona: " + aplicatie.alegereComada() + " lei");
    }
}