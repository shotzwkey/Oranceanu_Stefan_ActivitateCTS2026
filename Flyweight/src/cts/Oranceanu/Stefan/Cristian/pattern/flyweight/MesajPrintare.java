package cts.Oranceanu.Stefan.Cristian.pattern.flyweight;

public class MesajPrintare implements IPrintare {
    private ETipPrintare tipPrintare;

    public MesajPrintare(ETipPrintare tipPrintare) {
        this.tipPrintare = tipPrintare;
        System.out.println("S-a creat obj cu printare: " + this.tipPrintare);
    }

    public ETipPrintare getTipPrintare() {
        return tipPrintare;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("Pentru printare s-a folosit formatul: " + this.getTipPrintare());
        System.out.println("Se printeaza bonul de la masa " + bon.getNrMasa() + " cu costul: " + bon.getCostTotal() + " RON");
    }
}