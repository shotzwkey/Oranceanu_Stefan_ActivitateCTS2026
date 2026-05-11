package Decorator;

public class Program {
    public static void main(String[] args) {
        ANotificare notificare = new Notificare("mesaj implicit", 1);
        System.out.println(notificare.getMesaj());
        System.out.println(notificare.getCost());

        ANotificare notificareDecorata = new DecoratorSMS(new DecoratorEmail(new Notificare("decorare multipla", 3)));
        System.out.println(notificareDecorata.getMesaj());
        System.out.println(notificareDecorata.getCost());

        ANotificare toateDecorarile = new DecoratorPush(new DecoratorSMS(new DecoratorEmail(new Notificare("toate canalele", 6))));
        System.out.println(toateDecorarile.getMesaj());
        System.out.println(toateDecorarile.getCost());
    }
}
