package cts.Oranceanu.Stefan.g1162.pattern.singleton;

public class ConexiuneTemperatura implements  RoboticArmConnection{
    private static ConexiuneTemperatura instanta = null;

    public ConexiuneTemperatura() {}

    public static synchronized ConexiuneTemperatura getInstanta(){
        if(instanta == null)
        {
            instanta = new ConexiuneTemperatura();
        }
        return instanta;
    }

    @Override
    public void conexiune() {
        System.out.println("Brat robotic conectat la temperatura");
    }
}

