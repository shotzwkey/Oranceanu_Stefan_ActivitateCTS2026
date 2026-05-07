package Flyweight;

public class FormatTichet implements IPrintareTichetJava{
    private ETipLoc tipLoc;

    FormatTichet(ETipLoc tipLoc) {
        this.tipLoc = tipLoc;
    }


    @Override
    public void printeazaTichet(Tichet tichet) {
        System.out.println("Tip loc:" + this.tipLoc);
        System.out.println("Ora:" + tichet.getOraSosire());
        System.out.println("Nr Inmatriculare:" + tichet.getNrInmatriculare());
    }
}
