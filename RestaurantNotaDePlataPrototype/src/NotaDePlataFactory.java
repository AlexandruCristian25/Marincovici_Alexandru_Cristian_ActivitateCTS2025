import java.util.HashMap;
import java.util.Map;

public class NotaDePlataFactory {

    private Map<String, NotaDePlata> noteTiparite = new HashMap<>();

    public void tiparesteNotaDePlata(String mesaj, NotaDePlata notaDePlata) {

        noteTiparite.put(mesaj, notaDePlata);

    }

    public NotaDePlata creeazaNota(String mesaj) {

        NotaDePlata prototip = noteTiparite.get(mesaj);
        if(prototip != null) {

            return prototip.clone();

        } else {

            throw new IllegalArgumentException("Mesajul de pe nota de plata nu a fost tiparit: " + mesaj + "!");

        }

    }

}
