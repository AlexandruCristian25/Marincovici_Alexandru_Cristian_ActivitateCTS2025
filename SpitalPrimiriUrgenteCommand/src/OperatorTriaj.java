import java.util.ArrayList;
import java.util.List;

public class OperatorTriaj {
    private List<Comanda> coadaComenzi = new ArrayList<>();

    public void adaugaComanda(Comanda comanda) {
        coadaComenzi.add(comanda);
    }

    public void proceseazaComenzi() {
        for (Comanda comanda : coadaComenzi) {
            comanda.executa();
        }
        coadaComenzi.clear();
    }
}
