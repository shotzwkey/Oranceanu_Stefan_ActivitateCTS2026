package Composite;

public class Program {
    public static void main(String[] args) {

        Compus playlistPrincipal = new Compus("Playlist Principal");

        Compus playlistRock = new Compus("Playlist Rock");
        playlistRock.adaugaNod(new Melodie("Thunderstruck", 292));
        playlistRock.adaugaNod(new Melodie("Bohemian Rhapsody", 354));
        playlistRock.adaugaNod(new Melodie("Hotel California", 391));

        Compus playlistPop = new Compus("Playlist Pop");
        playlistPop.adaugaNod(new Melodie("Blinding Lights", 200));
        playlistPop.adaugaNod(new Melodie("Shape of You", 234));

        playlistPrincipal.adaugaNod(playlistRock);
        playlistPrincipal.adaugaNod(playlistPop);

        System.out.println(playlistPrincipal.getInfo());
        System.out.println("Durata totala playlist rock: " + playlistRock.getDurata() + "s");
        System.out.println("Durata totala playlist pop: " + playlistPop.getDurata() + "s");
        System.out.println("Durata totala principala: " + playlistPrincipal.getDurata() + "s");
    }
}