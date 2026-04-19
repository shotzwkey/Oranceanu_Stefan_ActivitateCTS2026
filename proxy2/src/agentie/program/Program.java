package agentie.program;

import agentie.clase.PachetTransport;
import agentie.clase.Persoana;
import agentie.clase.ProxyPachet;

public class Program {

    public static void main(String[] args) {
        Persoana persoana = new Persoana("Popescu", 67);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervaPachet();

        Persoana persoana2 = new Persoana("Ionescu", 30);
        ProxyPachet pachetTransportProxy2 = new ProxyPachet(persoana2);
        pachetTransportProxy2.rezervaPachet();
    }

}