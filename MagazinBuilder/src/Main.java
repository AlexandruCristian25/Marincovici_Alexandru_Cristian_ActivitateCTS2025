public class Main {
    public static void main(String[] args) {

        Eticheta eticheta1 = new EtichetaBuilder()
                .setDataExpirare("12/2025")
                .setImportator("Importator")
                .setIngrediente("cacao")
                .setGramaj("200").build();
        eticheta1.printareEticheta();

        Eticheta eticheta2 = new EtichetaBuilder()
                .setImportator("Importator")
                .setIngrediente("cacao")
                .setGramaj("200").build();
        eticheta2.printareEticheta();

    }
}