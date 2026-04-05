package cts.Oranceanu.Stefan.Cristian.pattern.flyweight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InregistrariPrintare {
    private ETipPrintare tipPrintare;
    private int nrMasa;
    private float costTotal;
    private String timestamp;

    public InregistrariPrintare(ETipPrintare tipPrintare, int nrMasa, float costTotal) {
        this.tipPrintare = tipPrintare;
        this.nrMasa = nrMasa;
        this.costTotal = costTotal;
        this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public ETipPrintare getTipPrintare() {
        return tipPrintare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public float getCostTotal() {
        return costTotal;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] Tip: " + tipPrintare + " | Masa: " + nrMasa + " | Cost: " + costTotal + " RON";
    }
}