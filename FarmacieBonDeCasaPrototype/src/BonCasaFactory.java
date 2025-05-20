import java.util.HashMap;
import java.util.Map;

public class BonCasaFactory {

    private Map<String, BonCasa> bonPrintat = new HashMap<>();

    public void printeazaBon(String nume, BonCasa bonCasa) {

        bonPrintat.put(nume, bonCasa);

    }

    public BonCasa creeazaBon(String nume, BonCasa bon) throws CloneNotSupportedException {

        BonCasa prototip = bonPrintat.get(nume);
        if(prototip != null) {

            return (BonCasa) prototip.clone();

        } else {

            throw new IllegalArgumentException("Bonul nu a fost printat: " + nume);

        }

    }

}
