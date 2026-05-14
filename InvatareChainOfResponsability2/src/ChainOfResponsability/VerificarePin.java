package ChainOfResponsability;

public class VerificarePin extends AHandler{
    @Override
    public boolean Autentificare(Utilizator utilizator) {
        if (utilizator.getPIN() >= 1000 && utilizator.getPIN() <= 9999)
        {
            if(this.nextHandler != null)
            {
                return this.nextHandler.Autentificare(utilizator);
            } else {
                return  true;
            }
        }
        else
        {
            return false;
        }
    }
}
