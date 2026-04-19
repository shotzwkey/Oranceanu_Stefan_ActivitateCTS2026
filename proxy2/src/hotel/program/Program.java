package hotel.program;

import hotel.clase.ProxyRezervare;
import hotel.clase.Rezervare;

public class Program {

    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(2, 111);
        rezervare.anulareRezervare();

        ProxyRezervare proxy = new ProxyRezervare(rezervare);
        proxy.anulareRezervare();

        Rezervare rezervare2 = new Rezervare(1, 222);
        ProxyRezervare proxy2 = new ProxyRezervare(rezervare2);
        proxy2.anulareRezervare();
    }

}
