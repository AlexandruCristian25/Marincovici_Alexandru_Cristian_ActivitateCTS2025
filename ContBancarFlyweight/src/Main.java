//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Detinator d1 = ContFlyweight.getDetinator("Popescu Ion", "popescu@yahoo.com", "0722445566");
        Cont c1 = ContFlyweight.getCont("Popescu", "Reiffeisen", 1000);

        Detinator d2 = ContFlyweight.getDetinator("Ionescu Alex", "ionescu@yahoo.com", "0755669933");
        Cont c2 = ContFlyweight.getCont("Ionescu", "ING", 3000);

        Suma suma1 = new Suma("RON", 1000, d1, c1);
        Suma suma2 = new Suma("EURO", 3000, d2, c2);

        suma1.afiseazaSuma();
        System.out.println("====================");
        suma2.afiseazaSuma();

    }
}