public class Pacient {

    private String numeP;
    private String nrTelefon;
    private String adresa;

    public Pacient(String numeP, String nrTelefon, String adresa) {
        this.numeP = numeP;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNumeP() {
        return numeP;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numeP='" + numeP + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
