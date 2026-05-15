package Strategy;

public class Program {
    public static void main(String[] args) {

        AgentieImobiliara agentie = new AgentieImobiliara();
        agentie.addProprietate(new Proprietate("Apartament Centru", 120000, 65));
        agentie.addProprietate(new Proprietate("Vila Baneasa", 350000, 200));
        agentie.addProprietate(new Proprietate("Garsoniera Militari", 55000, 32));
        agentie.addProprietate(new Proprietate("Penthouse Floreasca", 280000, 150));

        agentie.setStrategieProprietate(new StrategiePret());
        System.out.println("Cea mai ieftina: " + agentie.alegereStrategie());

        agentie.setStrategieProprietate(new StrategieSuprafata());
        System.out.println("Suprafata cea mai mare: " + agentie.alegereStrategie());
    }
}