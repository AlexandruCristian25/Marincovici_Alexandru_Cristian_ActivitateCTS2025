import java.util.HashMap;
import java.util.Map;

public class StickerPrototype {

    private Map<String, Sticker> map = new HashMap<String, Sticker>();
    public Sticker getSticker(IMasina masina) throws CloneNotSupportedException {

        String cheie = masina.getModelMasina();
        if(map.containsKey(cheie)) {

            System.out.println("Clonare sticker" + cheie);
            return (Sticker) map.get(cheie).clone();

        } else {

            Sticker sticker = new Sticker(masina);
            map.put(cheie, sticker);

            return sticker;

        }

    }

}
