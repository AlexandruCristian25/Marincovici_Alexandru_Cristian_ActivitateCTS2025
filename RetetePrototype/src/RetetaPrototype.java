import java.util.HashMap;
import java.util.Map;

public class RetetaPrototype {

    private Map<String, Reteta> map = new HashMap<>();
    public Reteta getReteta(IReteta reteta) throws CloneNotSupportedException {

        String cheie = reteta.getTipReteta();
        if(map.containsKey(cheie)) {

            System.out.println("Clonare reteta " + cheie);
            return (Reteta) map.get(cheie).clone();

        } else {

            Reteta reteta = new Reteta(reteta);
            map.put(cheie, reteta);

            return reteta;

        }

    }

}
