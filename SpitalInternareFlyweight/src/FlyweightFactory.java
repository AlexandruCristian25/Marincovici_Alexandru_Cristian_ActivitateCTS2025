import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, Pacient> pacienti = new HashMap<>();
    private static Map<String, Spital> spitale = new HashMap<>();

    public static Pacient getPacient(String nume, String nrTelefon,
                                     String adresa) {

        String key = nume + nrTelefon + adresa;
        if(!pacienti.containsKey(key)) {

            pacienti.put(key, new Pacient(nume, nrTelefon, adresa));

        }

        return pacienti.get(key);

    }

    public static Spital getSpital(String nume, String locatie, int nrMedici) {

        String key = nume + locatie + nrMedici;
        if(!spitale.containsKey(key)) {

            spitale.put(key, new Spital(nume, locatie, nrMedici));

        }

        return spitale.get(key);

    }

}
