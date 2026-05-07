package Flyweight;

public class Program {
    public static void main(String[] args) {

        Tichet t1 = new Tichet("B-123-ABC", "08:30");
        Tichet t2 = new Tichet("CJ-456-DEF", "09:15");
        Tichet t3 = new Tichet("IS-789-GHI", "10:00");
        Tichet t4 = new Tichet("TM-321-JKL", "11:45");
        Tichet t5 = new Tichet("SB-654-MNO", "13:20");

        FormatTichetFactory.getFormat(ETipLoc.STANDARD).printeazaTichet(t1);
        FormatTichetFactory.getFormat(ETipLoc.STANDARD).printeazaTichet(t2);
        FormatTichetFactory.getFormat(ETipLoc.STANDARD).printeazaTichet(t3);
        FormatTichetFactory.getFormat(ETipLoc.ELECTRIC).printeazaTichet(t4);
        FormatTichetFactory.getFormat(ETipLoc.HANDICAP).printeazaTichet(t5);

        System.out.println(FormatTichetFactory.getNrTicheteEmise());
    }
}