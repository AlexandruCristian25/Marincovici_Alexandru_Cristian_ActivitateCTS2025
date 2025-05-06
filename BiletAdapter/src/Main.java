//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bilet biletSimplu = new Bilet();
        biletSimplu.achizitioneazaBilet();

        Bilet bilet = new Bilet();
        Bilet biletAdaptat = new AdapterBilet(bilet);
        biletAdaptat.achizitioneazaBilet();

    }
}