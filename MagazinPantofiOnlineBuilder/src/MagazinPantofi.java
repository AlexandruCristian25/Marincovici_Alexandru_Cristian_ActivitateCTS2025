import java.util.ArrayList;
import java.util.List;

public class MagazinPantofi {
    private List<Pantof> pantofi = new ArrayList<>();
    private List<ICautare> criterii = new ArrayList<>();

    public void adaugaPantof(Pantof p) {
        pantofi.add(p);
    }

    public void adaugaCriteriu(ICautare criteriu) {
        criterii.add(criteriu);
    }

    public List<Pantof> cauta() {
        List<Pantof> rezultat = new ArrayList<>(pantofi);
        for (ICautare c : criterii) {
            if (c.esteActiv()) {
                rezultat = c.aplica(rezultat);
            }
        }
        return rezultat;
    }
}
