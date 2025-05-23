import java.util.HashMap;
import java.util.Map;

public class NotaDePlata {

    private String mesaj;
    private Map<String, Integer> suma;

    public NotaDePlata(String mesaj, Map<String, Integer> suma) {
        this.mesaj = mesaj;
        this.suma = new HashMap<>(suma);
    }

    public String getMesaj() {
        return mesaj;
    }

    public Map<String, Integer> getSuma() {
        return suma;
    }

    @Override
    protected NotaDePlata clone() {

        try {

            NotaDePlata copie = (NotaDePlata) super.clone();
            copie.suma = new HashMap<>(this.suma);
            return copie;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clonarea a esuat!", e);
        }

    }

    @Override
    public String toString() {
        return "NotaDePlata{" +
                "mesaj='" + mesaj + '\'' +
                ", suma=" + suma +
                '}';
    }
}
