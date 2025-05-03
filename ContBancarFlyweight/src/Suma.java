public class Suma {

    private String moneda;
    private double capital;

    private Detinator detinator;
    private Cont cont;

    public Suma(String moneda, double capital, Detinator detinator, Cont cont) {
        this.moneda = moneda;
        this.capital = capital;
        this.detinator = detinator;
        this.cont = cont;
    }

    public void afiseazaSuma() {

        System.out.println("Moneda: " + moneda + ", capital" + capital);
        System.out.println("Detinator: " + detinator);
        System.out.println("Cont: " + cont);

    }
}
