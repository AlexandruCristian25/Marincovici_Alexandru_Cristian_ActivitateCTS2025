public class Client implements IClient {
    private String nume;
    private IPlata metodaPlata;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void efectueazaPlata(double suma) {
        if (metodaPlata != null) {
            System.out.print("Clientul " + nume + ": ");
            metodaPlata.plateste(suma);
        } else {
            System.out.println("Nicio metodă de plată selectată pentru clientul " + nume);
        }
    }

    @Override
    public void setMetodaPlata(IPlata metoda) {
        this.metodaPlata = metoda;
    }
}