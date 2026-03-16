package cts.Oranceanu.Stefan.g1162.main;

import cts.Oranceanu.Stefan.g1162.pattern.singleton.ConexiuneInternet;
import cts.Oranceanu.Stefan.g1162.pattern.singleton.ConexiunePerimetral;
import cts.Oranceanu.Stefan.g1162.pattern.singleton.ConexiuneTemperatura;

public class Program {
    public static void main(String[] args) {
        ConexiuneInternet internet1 = ConexiuneInternet.getInstanta();
        ConexiuneInternet internet2 = ConexiuneInternet.getInstanta();
        ConexiuneTemperatura temperatura1 = ConexiuneTemperatura.getInstanta();
        ConexiunePerimetral perimetral1 = ConexiunePerimetral.getInstanta();

        internet1.conexiune();
        temperatura1.conexiune();
        perimetral1.conexiune();

        System.out.println("internet1 = internet2: " +(internet1 == internet2));
    }
}
