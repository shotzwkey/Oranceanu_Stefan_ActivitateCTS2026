public class Adaptor_Obiecte implements IMedEU{

    private MedRO medRO;

    public Adaptor_Obiecte(MedRO medRO) {
        this.medRO = medRO;
    }

    @Override
    public void proceseazaProgramarEU(FisaPacient fisaPacient) {
       this.medRO.proceseazaProgramare(fisaPacient.getNumePacient(), fisaPacient.getVarsta(), fisaPacient.getDiagnostic());
    }
}
