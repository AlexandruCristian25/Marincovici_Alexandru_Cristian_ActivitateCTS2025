public class Drona implements ServiceConnection {

    private String nume;
    private float pret;
    private int baterie;
    private boolean esteConectata;
    private static Drona instance;

    private Drona(String nume, float pret, int baterie) {
        this.nume = nume;
        this.pret = pret;
        this.baterie = baterie;
    }

    public static Drona getInstance(String nume, float pret, int baterie) {

        if(instance == null) {

            instance = new Drona(nume, pret, baterie);

        }

        return instance;
    }

    @Override
    public void connect() {
        this.esteConectata = true;
    }

    @Override
    public String toString() {
        return "Drona{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", baterie=" + baterie +
                ", esteConectata=" + esteConectata +
                '}';
    }
}
