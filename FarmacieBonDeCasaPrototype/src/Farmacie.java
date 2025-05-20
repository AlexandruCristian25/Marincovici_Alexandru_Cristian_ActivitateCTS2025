import java.util.Map;

public class Farmacie {

    private BonCasaFactory factory;

    public Farmacie(BonCasaFactory factory) {

        this.factory = factory;

    }

    public BonCasa obtineBon(String nume) throws CloneNotSupportedException {

        BonCasa bonCasa = null;
        return factory.creeazaBon(nume, bonCasa);

    }

    public void adaugaBon(String nume, Map<String, Integer> nrBon) throws CloneNotSupportedException {

        BonCasa bon = new BonCasa(nume, nrBon);
        factory.creeazaBon(nume, bon);

    }

}
