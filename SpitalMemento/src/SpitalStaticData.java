public class SpitalStaticData {

    private final String numeS;
    private final int nrMedici;
    private final String locatie;

    public SpitalStaticData(String numeS, int nrMedici, String locatie) {
        this.numeS = numeS;
        this.nrMedici = nrMedici;
        this.locatie = locatie;
    }

    public String getNumeS() {
        return numeS;
    }

    public int getNrMedici() {
        return nrMedici;
    }

    public String getLocatie() {
        return locatie;
    }
}
