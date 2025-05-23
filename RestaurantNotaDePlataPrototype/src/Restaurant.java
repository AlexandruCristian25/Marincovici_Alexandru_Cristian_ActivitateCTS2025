import java.util.Map;

public class Restaurant {

    private NotaDePlataFactory factory;

    public Restaurant(NotaDePlataFactory factory) {

        this.factory = factory;

    }

    public NotaDePlata obtineNota(String mesaj) {

        return factory.creeazaNota(mesaj);

    }

    public void adaugaNotaNoua(String mesaj, Map<String, Integer> suma) {

        NotaDePlata notaDePlata = new NotaDePlata(mesaj, suma);
        factory.creeazaNota(mesaj);

    }

}
