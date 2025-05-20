import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        BonCasaFactory factory = new BonCasaFactory();
        Farmacie farmacie = new Farmacie(factory);

        Map<String, Integer> nrBon = new HashMap<>();
        nrBon.put("Bon casa 1", 0051);
        nrBon.put("Bon casa 2", 0055);
        nrBon.put("Bon casa 3", 0056);

        farmacie.adaugaBon("Famacie1", nrBon);

        BonCasa b1 = farmacie.obtineBon("Medicament1");
        BonCasa b2 = farmacie.obtineBon("Medicament2");
        BonCasa b3 = farmacie.obtineBon("Medicament3");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("Sunt obiecte diferite: " + (b1 != b2));

    }
}