package ChainOfResponsability;

public class VerificarePolita extends AHandler {
    @Override
    public boolean aprobareCerere(Cerere cerere) {
        if (cerere.isPolitaActiva()) {
            if (this.nextHandler != null) {
                return this.nextHandler.aprobareCerere(cerere);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}


