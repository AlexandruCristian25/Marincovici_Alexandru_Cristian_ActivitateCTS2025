public class Produs implements IProdus {
    private String denumire;
    private int stoc;

    public Produs(String denumire, int stoc) {
        this.denumire = denumire;
        this.stoc = stoc;
    }

    @Override
    public void afiseaza() {
        System.out.println("Produs: " + denumire + " | Stoc: " + stoc);
    }

    @Override
    public int getNrProduse() {
        return stoc;
    }
}
