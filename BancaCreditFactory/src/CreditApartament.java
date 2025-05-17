public class CreditApartament implements  CreditRON{

    private double sold;
    private String numeBeneficiar;

    public CreditApartament(double sold, String numeBeneficiar) {
        this.sold = sold;
        this.numeBeneficiar = numeBeneficiar;
    }

    @Override
    public void afisareDetalii() {

        System.out.println("Credit apartament cu soldul de: " + sold + " RON al beneficiarului " + numeBeneficiar);

    }
}
