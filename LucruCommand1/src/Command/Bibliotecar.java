package Command;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecar {

    private List<IGestiune> listaCarti;

    public Bibliotecar() {
        this.listaCarti = new ArrayList<>();
    }

    public void preiaCartea(IGestiune gestiune)
    {
        this.listaCarti.add(gestiune);
    }

    public void duceCartile()
    {
        for(IGestiune g: this.listaCarti)
            g.proceseaza();
        this.listaCarti.clear();
    }
}
