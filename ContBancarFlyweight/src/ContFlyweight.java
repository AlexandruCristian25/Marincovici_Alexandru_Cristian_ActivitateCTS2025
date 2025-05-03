import java.util.HashMap;
import java.util.Map;

public class ContFlyweight {

    private static Map<String, Detinator> detinatori = new HashMap<>();
    private static Map<String, Cont> conturi = new HashMap<>();

    public static Detinator getDetinator(String nume, String email, String telefon) {

        String key = nume + email + telefon;
        if(!detinatori.containsKey(key)) {

            detinatori.put(key, new Detinator(nume, email, telefon));

        }

        return detinatori.get(key);

    }

    public static Cont getCont(String nume, String sucursala, double suma) {

        String key = nume + sucursala;
        if(!conturi.containsKey(key)) {

            conturi.put(key, new Cont(nume, sucursala, suma));

        }

        return conturi.get(key);

    }

}
