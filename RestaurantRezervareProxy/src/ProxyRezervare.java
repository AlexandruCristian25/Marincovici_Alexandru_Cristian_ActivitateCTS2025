public class ProxyRezervare implements Rezervare {
    private RezervareReala rezervareReala;

    public ProxyRezervare() {
        this.rezervareReala = new RezervareReala();
    }

    @Override
    public void faRezervare(String numeClient, int nrPersoane) {
        if (nrPersoane >= 4) {
            rezervareReala.faRezervare(numeClient, nrPersoane);
        } else {
            System.out.println("Rezervările se acceptă doar pentru minim 4 persoane. "
                    + "Pentru 2 persoane, vă așteptăm direct la restaurant.");
        }
    }
}