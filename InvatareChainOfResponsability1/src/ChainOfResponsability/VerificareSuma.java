package ChainOfResponsability;

public class VerificareSuma extends AHandler{
    @Override
    public boolean aprobareCerere(Cerere cerere) {
        if(cerere.getSuma() <= 50000)
        {
            if(this.nextHandler != null)
            {
                return this.nextHandler.aprobareCerere(cerere);
            } else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
