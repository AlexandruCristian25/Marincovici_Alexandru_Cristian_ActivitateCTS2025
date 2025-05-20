import java.util.HashMap;
import java.util.Map;

public class BonCasa implements Cloneable {

    private String nume;
    private Map<String, Integer> nrBon;

    public BonCasa(String nume, Map<String, Integer> nrBon) {
        this.nume = nume;
        this.nrBon = nrBon;
    }

    public String getNume() {
        return nume;
    }

    public Map<String, Integer> getNrBon() {
        return nrBon;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        try {

            BonCasa copie = (BonCasa) super.clone();
            copie.nrBon = new HashMap<>(this.nrBon);
            return copie;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea a esuat!", e);
        }

    }

    @Override
    public String toString() {
        return "BonCasa{" +
                "nume='" + nume + '\'' +
                ", nrBon=" + nrBon +
                '}';
    }
}
