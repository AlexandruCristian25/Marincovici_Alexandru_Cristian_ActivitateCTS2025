//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rezervare r1 = RezervareFlyweight.getRezervare("Popescu Ion", "07:00", 4);
        Client c1 = RezervareFlyweight.getClient("Popescu", "0711223344", "popescu@email.com");

        Rezervare r2 = RezervareFlyweight.getRezervare("Vasilescu Pompiliu", "11:00", 6);
        Client c2 = RezervareFlyweight.getClient("Vasilescu", "0788996655", "vasilescu@email.com");

        SumaPlatita s1 = new SumaPlatita("RON", 300.50, c1, r1);
        SumaPlatita s2 = new SumaPlatita("EURO", 255.99, c2, r2);

        s1.afiseazaSuma();
        System.out.println("===================");
        s2.afiseazaSuma();

    }
}