public class Pantof {
    private String nume;
    private String culoare;
    private int marime;
    private double pret;

    public Pantof(String nume, String culoare, int marime, double pret) {
        this.nume = nume;
        this.culoare = culoare;
        this.marime = marime;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getMarime() {
        return marime;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return nume + " - Culoare: " + culoare + ", Marime: " + marime + ", Pret: " + pret + " RON";
    }
}
