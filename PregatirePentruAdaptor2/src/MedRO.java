public class MedRO implements IMedRO{
    @Override
    public void proceseazaProgramare(String numePacient, int varsta, String diagnostic) {
        System.out.println("Se implementeaza conditiile pentru Modul:");
        if(varsta < 18 || diagnostic.isEmpty())
        {
            System.out.println("Programarea nu se poate procesa");
        }
        else
            System.out.println("Programarea are loc: " + "nume pacient: " + numePacient + "varsta: " + varsta + "diagnostic: " + diagnostic);
    }
}
