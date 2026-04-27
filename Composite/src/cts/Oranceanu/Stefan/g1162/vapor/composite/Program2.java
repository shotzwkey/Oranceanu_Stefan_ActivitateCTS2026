package cts.Oranceanu.Stefan.g1162.vapor.composite;

public class Program2 {
    public static void main(String[] args) {
        Container vapor = new Container("Vapor");

        Container container1 = new Container("Container 1");
        Container container2 = new Container("Container 2");

        container1.adaugaColet(new Colet("Electronice", 5, true));
        container1.adaugaColet(new Colet("Carti", 12, false));

        container2.adaugaColet(new Colet("Mobilier", 80, false));
        container2.adaugaColet(new Colet("Sticla Murano", 3, true));

        vapor.adaugaColet(container1);
        vapor.adaugaColet(container2);
        vapor.adaugaColet(new Colet("Rezerva motorina", 200, false));

        System.out.println(vapor.getInfo(0));

        //TO DO
        //1. De refacut implementarea astfel incat sa indeplinim Interface Segregation
        //2. De modificat getInfo() astfel incat sa afiseze cu tab-uri corespunzatoare ierarhia definita de Composite
        //3. ex2 => existenta unui vapor/container => containere mai mici => colete/structuri => nodul frunza (colet)
        //3. ex2/1. Fiecare colet are o greutate, fiecare structura are o greutate si sa se calculeze greutatea totala a oricarui nod;
        //3. ex2/2. Fiecare colet are un flag daca esteFragil sau nu. Iar, o structura se considera fragila daca contine cel putin un colet fragil

        //Am rezolvat cerintele cu vaporul.
    }
}