package Proxy;

public class Animal {

    private String numeAnimal;
    private String specie;

    public Animal(String numeAnimal, String specie) {
        this.numeAnimal = numeAnimal;
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Animal [ " + " numeAnimal = " + numeAnimal + ", specie = " + specie + "]";
    }

    public String getNumeAnimal() {
        return numeAnimal;
    }

    public String getSpecie() {
        return specie;
    }
}
