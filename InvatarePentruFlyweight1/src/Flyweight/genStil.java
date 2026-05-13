package Flyweight;

public class genStil implements ICaracter{

    private  EStil stil;
    private String font;
    private int dimensiune;
    private String culoare;

     genStil(EStil stil) {
        this.stil = stil;

         if (stil == EStil.TITLU) {
             this.font = "Arial Bold";
             this.dimensiune = 24;
             this.culoare = "negru";
         } else if (stil == EStil.SUBTITLU) {
             this.font = "Arial";
             this.dimensiune = 18;
             this.culoare = "gri";
         } else {
             this.font = "Times New Roman";
             this.dimensiune = 12;
             this.culoare = "negru";
         }
         System.out.println("S-a creat stilul: " + this.stil);
    }

    public EStil getStil() {
        return stil;
    }

    @Override
    public void genereazaCaractere(Caracter caracter) {
        System.out.println("Stil: " + stil + " | font: " + font + " | dim: " + dimensiune + " | culoare: " + culoare + " | linia: " + caracter.getLinie() + ", coloana: " + caracter.getColoana());
    }
}
