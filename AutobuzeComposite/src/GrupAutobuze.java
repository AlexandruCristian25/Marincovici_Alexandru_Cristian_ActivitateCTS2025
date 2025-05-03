import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze extends AutobuzComponent {
    private String numeGrup;
    private List<AutobuzComponent> componente = new ArrayList<>();

    public GrupAutobuze(String numeGrup) {
        this.numeGrup = numeGrup;
    }

    public void adauga(AutobuzComponent c) {
        componente.add(c);
    }

    public void afiseazaDetalii() {
        System.out.println("Grup: " + numeGrup);
        for (AutobuzComponent comp : componente) {
            comp.afiseazaDetalii();
        }
    }
}