package cts.Oranceanu.Stefan.g1162.pattern.composite;

import java.util.ArrayList;

public class Structura implements INodStructura {
    private ArrayList<INodFrunza> structura = new ArrayList<>();
    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    public String getDenumire() {
        return numeStructura;
    }

    @Override
    public int getPret() {
        int total = 0;
        for (INodFrunza nod : structura) {
            total += nod.getPret();
        }
        return total;
    }

    @Override
    public String getInfo(int nivel) {
        String tabs = "\t".repeat(nivel);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs).append(numeStructura).append("\n");
        for (INodFrunza nod : structura) {
            sb.append(nod.getInfo(nivel + 1)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void adaugaNod(INodFrunza elem) {
        structura.add(elem);
    }

    @Override
    public void eliminaNod(INodFrunza elem) {
        structura.remove(elem);
    }

    @Override
    public INodFrunza getNod(int i) {
        return structura.get(i);
    }
}