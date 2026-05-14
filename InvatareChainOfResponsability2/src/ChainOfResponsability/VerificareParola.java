package ChainOfResponsability;

public class VerificareParola extends AHandler{
    @Override
    public boolean Autentificare(Utilizator utilizator) {
       if(utilizator.getParola().length() >= 8)
       {
            if(this.nextHandler != null)
            {
                return this.nextHandler.Autentificare(utilizator);
            } else {
                return true;
            }
       }
       else {
           return false;
       }
    }
}
