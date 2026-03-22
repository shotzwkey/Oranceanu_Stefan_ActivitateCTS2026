package cts.Oranceanu.Stefan.g1162.main;

import cts.Oranceanu.Stefan.g1162.pattern.builder.Petrecere;
import cts.Oranceanu.Stefan.g1162.pattern.builder.PetrecereBuilder;

public class Program {

    public static void main(String[] args) {
        PetrecereBuilder builder = new PetrecereBuilder();
        Petrecere petrecereTest = builder.build();
        builder = builder.setAreBaloane(true);
        System.out.println(petrecereTest);
        Petrecere petrecere = builder.setAreArtificii(true)
                .setNrPersoane(20)
                .setAreTort(true).build();

        System.out.println(petrecere);
    }

}
