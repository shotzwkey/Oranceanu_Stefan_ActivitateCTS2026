package Observer;

public class Program {
    public static void main(String[] args) {

        StatieMeteo statie = new StatieMeteo("Bucuresti");

        PanouAfisaj panou = new PanouAfisaj("Cluj");
        SistemAlerta alerta = new SistemAlerta(35);

        statie.addObserver(panou);
        statie.addObserver(alerta);

        statie.setTemperatura(28);
        statie.setTemperatura(37);

        statie.removeObserver(alerta);

        statie.setTemperatura(40);
    }
}