public class MedEU implements IMedEU{
    @Override
    public void proceseazaProgramarEU(FisaPacient fisaPacient) {
        System.out.println("Se implementeaza conditiile pentru Modul:");
        if(fisaPacient.getVarsta() < 18 || fisaPacient.getDiagnostic().isEmpty())
        {
            System.out.println("Programarea nu se poate procesa");
        }
        else
            System.out.println("Programarea are loc: " + "nume pacient: " + fisaPacient.getNumePacient() + "varsta: " + fisaPacient.getVarsta() + "diagnostic: " + fisaPacient.getDiagnostic());
    }
}
