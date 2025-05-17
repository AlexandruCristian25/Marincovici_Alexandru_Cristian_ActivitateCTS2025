public class Salon {

    private int nrSalon;
    private int nrPat;
    private int nrZileSp;

    private Pacient pacient;
    private Spital spital;

    public Salon(int nrSalon, int nrPat, int nrZileSp, String pacient, String spital) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSp = nrZileSp;
        //this.pacient = pacient;
        //this.spital = spital;
    }

    public void afiseazaSalon() {

        System.out.println("Salonul " + nrSalon);
        System.out.println("Pacientul " + pacient);
        System.out.println("Spitalul " + spital);

    }
}
