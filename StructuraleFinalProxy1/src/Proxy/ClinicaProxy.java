package Proxy;

public class ClinicaProxy implements IClinica{

    private IClinica clinica;

    public ClinicaProxy(IClinica clinica) {
        super();
        this.clinica = clinica;
    }


    @Override
    public void vizualizareFisa(FisaMedicala fisaMedicala, Animal animal, Medic medic) {
        if(medic.isEsteSpecializat())
        {
            clinica.vizualizareFisa(fisaMedicala, animal, medic);
        }
        else
        {
            System.out.println("Medicul nu este specializat in specia: " + animal.getSpecie());
        }
    }

    @Override
    public void listareFise() {
        this.clinica.listareFise();
    }
}
