package cts.Oranceanu.Stefan.g1162.pattern.singleton;

public class ConexiunePerimetral implements  RoboticArmConnection{
    private static ConexiunePerimetral instanta = null;

    public ConexiunePerimetral() {}

    public static synchronized ConexiunePerimetral getInstanta(){
        if(instanta == null)
        {
            instanta = new ConexiunePerimetral();
        }
        return instanta;
    }

    @Override
    public void conexiune() {
        System.out.println("Brat robotic conectat la perimetral");
    }
}


