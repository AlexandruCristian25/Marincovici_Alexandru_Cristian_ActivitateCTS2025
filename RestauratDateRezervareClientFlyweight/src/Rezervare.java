public class Rezervare {

    private String numeClient;
    private String ora;
    private int nrPersoane;

    public Rezervare(String numeClient, String ora, int nrPersoane) {
        this.numeClient = numeClient;
        this.ora = ora;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public String getOra() {
        return ora;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", ora='" + ora + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }
}
