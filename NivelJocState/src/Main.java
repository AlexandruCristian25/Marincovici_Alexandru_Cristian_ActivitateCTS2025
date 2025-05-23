//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NivelJoc nivelJoc = new NivelJoc(10);

        nivelJoc.stareNivelJoc();
        nivelJoc.balance(1);

        nivelJoc.stareNivelJoc();
        nivelJoc.balance(10);

        nivelJoc.stareNivelJoc1();
        nivelJoc.balance(0);

        nivelJoc.stareNivelJoc1();
        nivelJoc.balance(15);

    }
}