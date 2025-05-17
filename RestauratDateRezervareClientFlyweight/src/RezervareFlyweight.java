import java.util.HashMap;
import java.util.Map;

public class RezervareFlyweight {

    private static Map<String, Client> clienti = new HashMap<>();
    private static Map<String, Rezervare> rezervari = new HashMap<>();

    public static Client getClient(String nume, String nrTelefon,
                                   String email) {

        String key = nume + nrTelefon + email;
        if(!clienti.containsKey(key)) {

            clienti.put(key, new Client(nume, nrTelefon, email));

        }

        return clienti.get(key);

    }

    public static Rezervare getRezervare(String numeClient, String ora,
                                   int nrPersoane) {

        String key = numeClient + ora + nrPersoane;
        if(!rezervari.containsKey(key)) {

            rezervari.put(key, new Rezervare(numeClient, ora, nrPersoane));

        }

        return rezervari.get(key);

    }

}
