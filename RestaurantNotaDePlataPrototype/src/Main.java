import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        NotaDePlataFactory factory = new NotaDePlataFactory();
        Restaurant restaurant = new Restaurant(factory);

        Map<String, Integer> suma = new HashMap<>();
        suma.put("Suma 1", 250);
        suma.put("Suma 2", 400);

        restaurant.adaugaNotaNoua("Nota noua", suma);

        NotaDePlata n1 = restaurant.obtineNota("La multi ani!");
        NotaDePlata n2 = restaurant.obtineNota("La multi ani!");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Sunt obiecte diferite" + (n1 != n2));

    }
}