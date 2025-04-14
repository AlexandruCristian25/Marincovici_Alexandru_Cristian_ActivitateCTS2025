public abstract class Medicament {
    protected String denumire;
    protected double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void afiseazaInfo();
}
