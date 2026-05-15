package Strategy;

public class Program {
    public static void main(String[] args) {

        AplicatieFitness aplicatie = new AplicatieFitness();
        aplicatie.addExercitiu(new Exercitiu("Alergare", 500, 30));
        aplicatie.addExercitiu(new Exercitiu("Ciclism", 400, 45));
        aplicatie.addExercitiu(new Exercitiu("Inot", 600, 60));
        aplicatie.addExercitiu(new Exercitiu("Sarit coarda", 350, 20));

        aplicatie.setStrategieAlegere(new StrategieArdereCalorii());
        System.out.println("Exercitiu cu cele mai multe calorii: " + aplicatie.alegereStrategie());

        aplicatie.setStrategieAlegere(new StrategieDurata());
        System.out.println("Exercitiu cu durata cea mai scurta: " + aplicatie.alegereStrategie());
    }
}