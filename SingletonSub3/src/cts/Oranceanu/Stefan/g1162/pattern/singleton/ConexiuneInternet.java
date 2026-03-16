package cts.Oranceanu.Stefan.g1162.pattern.singleton;

public class ConexiuneInternet implements  RoboticArmConnection{
    private static ConexiuneInternet instanta = null;

    public ConexiuneInternet() {}

    public static synchronized ConexiuneInternet getInstanta(){
        if(instanta == null)
        {
            instanta = new ConexiuneInternet();
        }
        return instanta;
    }

    @Override
    public void conexiune() {
        System.out.println("Brat robotic conectat la internet");
    }
}
