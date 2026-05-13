package Flyweight;

public class Program {
    public static void main(String[] args) {

        Flyweight.getCaracter(EStil.PARAGRAF).genereazaCaractere(new Caracter(1, 1));
        Flyweight.getCaracter(EStil.PARAGRAF).genereazaCaractere(new Caracter(1, 2));
        Flyweight.getCaracter(EStil.PARAGRAF).genereazaCaractere(new Caracter(1, 3));
        Flyweight.getCaracter(EStil.PARAGRAF).genereazaCaractere(new Caracter(1, 4));
        Flyweight.getCaracter(EStil.TITLU).genereazaCaractere(new Caracter(2, 1));
        Flyweight.getCaracter(EStil.TITLU).genereazaCaractere(new Caracter(2, 2));
        Flyweight.getCaracter(EStil.SUBTITLU).genereazaCaractere(new Caracter(3, 1));

        System.out.println("Caractere generate: " + Flyweight.getNrGenerate());
        System.out.println("Stiluri create in memorie: " + Flyweight.getNrTipuri());
    }
}