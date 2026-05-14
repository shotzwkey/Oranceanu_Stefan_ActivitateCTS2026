package ChainOfResponsability;

public class VerificareIncredere extends AHandler{
    @Override
    public boolean Autentificare(Utilizator utilizator) {
        if(utilizator.isDeIncredere())
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
