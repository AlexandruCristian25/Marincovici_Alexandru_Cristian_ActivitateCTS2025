public class Spital {

    private String nume;
    private String locatie;
    private int nrMedici;

    public Spital(String nume, String locatie, int nrMedici) {
        this.nume = nume;
        this.locatie = locatie;
        this.nrMedici = nrMedici;
    }

    public String getNume() {
        return nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    @Override
    public String toString() {
        return "Spital{" +
                "nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", nrMedici=" + nrMedici +
                '}';
    }
}
