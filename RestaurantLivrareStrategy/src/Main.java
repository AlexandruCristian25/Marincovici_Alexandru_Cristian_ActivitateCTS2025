//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Livrare livrare = new Livrare();

        livrare.setLivrare(new LivrareCuBicicleta());
        livrare.livreaza();

        livrare.setLivrare(new LivrareCuMasina());
        livrare.livreaza();

        livrare.setLivrare(new LivrareCuScuterul());
        livrare.livreaza();

    }
}