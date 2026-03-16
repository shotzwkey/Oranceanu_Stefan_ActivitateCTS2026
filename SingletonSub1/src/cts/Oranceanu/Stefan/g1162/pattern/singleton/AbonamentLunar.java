package cts.Oranceanu.Stefan.g1162.pattern.singleton;

public class AbonamentLunar implements AbstractMembership{

    private String nume;
    private static AbonamentLunar instanta = null;

    private AbonamentLunar(String nume) {
        this.nume = nume;
    }


    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public void setNume(String nouNume) {
        this.nume = nouNume;
    }

    public static synchronized AbonamentLunar getInstanta(){
        if(instanta == null)
        {
            instanta = new AbonamentLunar("Abonament Netflix");
        }
        return instanta;
    }
}
