import java.util.ArrayList;
import java.util.List;

public class Categorie implements IProdus {
    private String denumire;
    private List<IProdus> continut = new ArrayList<>();

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    public void adauga(IProdus produs) {
        continut.add(produs);
    }

    @Override
    public void afiseaza() {
        System.out.println("Categorie: " + denumire + " | Total produse: " + getNrProduse());
        for (IProdus produs : continut) {
            produs.afiseaza();
        }
    }

    @Override
    public int getNrProduse() {
        int total = 0;
        for (IProdus produs : continut) {
            total += produs.getNrProduse();
        }
        return total;
    }
}
