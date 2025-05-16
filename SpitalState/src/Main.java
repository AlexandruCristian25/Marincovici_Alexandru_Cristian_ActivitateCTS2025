//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient(500);

        pacient.starePacient1();;
        pacient.balance(300);

        pacient.starePacient2();;
        pacient.balance(600);

        pacient.starePacient2();;
        pacient.balance(300);

        pacient.starePacient1();;
        pacient.balance(100);

    }
}