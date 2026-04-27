package cts.Oranceanu.Stefan.g1162.vapor.composite;

import java.util.ArrayList;

public class Container implements IContainer {
    private ArrayList<IColet> continut = new ArrayList<>();
    private String nume;

    public Container(String nume) {
        this.nume = nume;
    }

    @Override
    public String getDenumire() {
        return nume;
    }

    @Override
    public int getGreutate() {
        int total = 0;
        for (IColet c : continut) {
            total += c.getGreutate();
        }
        return total;
    }

    @Override
    public boolean esteFragil() {
        for (IColet c : continut) {
            if (c.esteFragil()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getInfo(int nivel) {
        String tabs = "\t".repeat(nivel);
        StringBuilder sb = new StringBuilder();
        sb.append(tabs).append(nume)
                .append(" | ").append(getGreutate()).append("kg")
                .append(esteFragil() ? " [FRAGIL]" : "").append("\n");
        for (IColet c : continut) {
            sb.append(c.getInfo(nivel + 1)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void adaugaColet(IColet colet) {
        continut.add(colet);
    }

    @Override
    public void eliminaColet(IColet colet) {
        continut.remove(colet);
    }

    @Override
    public IColet getColet(int i) {
        return continut.get(i);
    }
}
