public class Main {
    public static void main(String[] args) {

        Credit credit1 = CreditFactory.creeazaCredit("nevoi", 20000, 60);
        Credit credit2 = CreditFactory.creeazaCredit("ipotecar", 150000, 360);

        credit1.afiseazaDetalii();
        credit2.afiseazaDetalii();

    }
}