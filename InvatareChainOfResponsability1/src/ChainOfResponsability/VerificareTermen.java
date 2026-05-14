package ChainOfResponsability;

public class VerificareTermen extends AHandler{
    @Override
    public boolean aprobareCerere(Cerere cerere) {
        if(cerere.isRaportatTermen()){
            if(this.nextHandler!= null ){
                return this.nextHandler.aprobareCerere(cerere);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
