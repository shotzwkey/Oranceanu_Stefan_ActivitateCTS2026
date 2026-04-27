package cts.Oranceanu.Stefan.g1162.pattern.composite;

public class Program {
        public static void main(String[] args) {
            Structura structuraMeniu = new Structura("Meniu restaurant");
            Meniu meniu = new Meniu(structuraMeniu, "Pizzeria ASE");

            INodStructura structuraBauturi = new Structura("Bauturi");
            INodStructura structuraMancare = new Structura("Mancare");
            structuraMeniu.adaugaNod(structuraBauturi);
            structuraMeniu.adaugaNod(structuraMancare);

            structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
            structuraBauturi.adaugaNod(new Produs("Pepsi", 9));

            INodStructura structuraMancarePizza = new Structura("Pizza");
            INodStructura structuraMancarePaste = new Structura("Paste");
            structuraMancare.adaugaNod(structuraMancarePizza);
            structuraMancare.adaugaNod(structuraMancarePaste);

            structuraMancarePizza.adaugaNod(new Produs("Pizza Margherita", 25));
            structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 29));

            structuraMancarePaste.adaugaNod(new Produs("Paste carbonara", 27));
            structuraMancarePaste.adaugaNod(new Produs("Paste branza", 32));

            System.out.println(meniu.getNumeRestaurant());
            System.out.println(meniu.getInfo());

            //TO DO
            //1. De refacut implementarea astfel incat sa indeplinim Interface Segregation
            //2. De modificat getInfo() astfel incat sa afiseze cu tab-uri corespunzatoare ierarhia definita de Composite
            //3. ex2 => existenta unui vapor/container => containere mai mici => colete/structuri => nodul frunza (colet)
            //3. ex2/1. Fiecare colet are o greutate, fiecare structura are o greutate si sa se calculeze greutatea totala a oricarui nod;
            //3. ex2/2. Fiecare colet are un flag daca esteFragil sau nu. Iar, o structura se considera fragila daca contine cel putin un colet fragil

            //Am rezolvat aici cerintele 1 si 2.
        }
    }