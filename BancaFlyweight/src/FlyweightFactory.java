import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<String, Detinator> detinatori = new HashMap<>();
    private static Map<String, Banca> banci = new HashMap<>();

    public static Detinator getDetinator(String nume, String adresa, String telefon, String email) {
        String key = nume + adresa + telefon + email;
        if (!detinatori.containsKey(key)) {
            detinatori.put(key, new Detinator(nume, adresa, telefon, email));
        }
        return detinatori.get(key);
    }

    public static Banca getBanca(String nume, String sucursala, double capital) {
        String key = nume + sucursala;
        if (!banci.containsKey(key)) {
            banci.put(key, new Banca(nume, sucursala, capital));
        }
        return banci.get(key);
    }
}
