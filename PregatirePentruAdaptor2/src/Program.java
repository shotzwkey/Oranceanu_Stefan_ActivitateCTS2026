
public class Program {
        public static void main(String[] args) {

            IMedRO medRO = new MedRO();
            medRO.proceseazaProgramare("Ion Popescu", 45, "Hipertensiune");

            medRO.proceseazaProgramare("Andrei Popa", 15, "Raceala");

            IMedEU medEU = new MedEU();
            FisaPacient fisa1 = new FisaPacient("Maria Ionescu", 30, "Diabet");
            medEU.proceseazaProgramarEU(fisa1);

            FisaPacient fisa2 = new FisaPacient("Costel Marin", 22, "");
            medEU.proceseazaProgramarEU(fisa2);

            FisaPacient fisa3 = new FisaPacient("Elena Dumitrescu", 35, "Astm");
            IMedEU adaptor = new Adaptor_Obiecte(new MedRO());
            adaptor.proceseazaProgramarEU(fisa3);

            FisaPacient fisa4 = new FisaPacient("Gigel Vasilescu", 14, "Gripa");
            adaptor.proceseazaProgramarEU(fisa4);
        }
    }
