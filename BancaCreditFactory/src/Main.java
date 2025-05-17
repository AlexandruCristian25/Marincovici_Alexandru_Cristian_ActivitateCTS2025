//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CreditRON credit1 = CreditFactory.creeazaCredit("Salarizare", 7500, "Ionescu");
        CreditRON credit2 = CreditFactory.creeazaCredit("Apartament", 17500, "Popescu");

        credit1.afisareDetalii();
        credit2.afisareDetalii();

    }
}