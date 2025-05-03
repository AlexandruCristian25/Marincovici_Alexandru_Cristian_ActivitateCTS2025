public class Cont {

    private String nume;
    private String sucursala;
    private double suma;

    public Cont(String nume, String sucursala, double suma) {
        this.nume = nume;
        sucursala = sucursala;
        this.suma = suma;
    }

    public String getNume() {
        return nume;
    }

    public String getSucursala() {
        return sucursala;
    }

    public double getSuma() {
        return suma;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", Sucursala='" + sucursala + '\'' +
                ", suma=" + suma +
                '}';
    }
}
