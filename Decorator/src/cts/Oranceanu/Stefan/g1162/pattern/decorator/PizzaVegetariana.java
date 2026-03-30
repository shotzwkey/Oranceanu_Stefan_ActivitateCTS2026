package cts.Oranceanu.Stefan.g1162.pattern.decorator;

//clasa ProdusConcret din diagrama
public class PizzaVegetariana extends APizza{

    @Override
    String getComponente() {
        return "blat, sos rosii, ciuperci, ceapa";
    }

    @Override
    int getPret() {
        return 27;
    }

}
