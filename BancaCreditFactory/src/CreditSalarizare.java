public class CreditSalarizare implements CreditRON {

    private double sold;
    private String numeBeneficiar;

    public CreditSalarizare(double sold, String numeBeneficiar) {
        this.sold = sold;
        this.numeBeneficiar = numeBeneficiar;
    }


    @Override
    public void afisareDetalii() {
        System.out.println("Credit salarizare cu soldul de: " + sold + " RON al beneficiarului " + numeBeneficiar);
    }
}
