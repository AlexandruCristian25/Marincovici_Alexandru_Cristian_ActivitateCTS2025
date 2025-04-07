import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        try {

            Pantof pantof = new PantofBuilder()
                    .setTip(TipPantof.STILETTO)
                    .setNumar(38)
                    .setDimensiuneToc(8.5)
                    .setMaterialBaza("Piele")
                    .setMaterialeSecundare(Arrays.asList("Paiete", "Sclipici"))
                    .setMesaje(Arrays.asList("Hi", "Love"))
                    .build();

            System.out.println(pantof);

        } catch (PantofException e) {
            System.err.println("Eroare la creare pantof: " + e.getMessage());
        }
    }
}