package cts.Oranceanu.Stefan.g1162.main;

import cts.Oranceanu.Stefan.g1162.pattern.singleton.AbonamentLunar;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        AbonamentLunar ab1 = AbonamentLunar.getInstanta();
        AbonamentLunar ab2 = AbonamentLunar.getInstanta();

        Thread thread = new Thread(() -> {
            AbonamentLunar ab3 = AbonamentLunar.getInstanta();
            System.out.println("Acelasi abonament: " + (ab3 == ab1));
        });

        thread.start();
        thread.join();

        System.out.println("ab1 = ab2: " +(ab1 ==ab2));
        System.out.println("Abonament activ: " +ab1.getNume());
    }
}
