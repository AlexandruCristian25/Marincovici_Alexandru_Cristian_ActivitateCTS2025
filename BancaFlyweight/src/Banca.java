public class Banca {
    private String nume;
    private String sucursala;
    private double capital;

    public Banca(String nume, String sucursala, double capital) {
        this.nume = nume;
        this.sucursala = sucursala;
        this.capital = capital;
    }

    public String getNume() {
        return nume;
    }

    public String getSucursala() {
        return sucursala;
    }

    public double getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "nume='" + nume + '\'' +
                ", sucursala='" + sucursala + '\'' +
                ", capital=" + capital +
                '}';
    }
}
