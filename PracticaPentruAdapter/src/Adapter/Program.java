package Adapter;

public class Program {
    public static void main(String[] args) {

        IAutoRO autoRO = new AutoRO();
        autoRO.inchiriaza("Ion Popescu", 5, "SUV");

        IAutoEU autoEU = new AutoEU();
        CerereInchiriere cerere = new CerereInchiriere("Maria Ionescu", 3, "Sedan");
        autoEU.inchiriazaEU(cerere);

        CerereInchiriere cerere2 = new CerereInchiriere("Andrei Popa", 7, "Berlina");
        IAutoEU adaptor = new Adaptor_Obiect(new AutoRO());
        adaptor.inchiriazaEU(cerere2);
    }
}