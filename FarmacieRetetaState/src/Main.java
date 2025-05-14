//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Reteta reteta = new Reteta(100);

        reteta.stareReteta();
        reteta.balance(50);

        reteta.stareReteta2();
        reteta.balance(500);

    }
}