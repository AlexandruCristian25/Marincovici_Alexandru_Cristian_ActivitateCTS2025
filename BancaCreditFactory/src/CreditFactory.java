public class CreditFactory {

    public static  CreditRON creeazaCredit(String tip, double sold,
                                           String numeBeneficiar) {

        switch (tip.toLowerCase()) {

            case "salarizare":
                return new CreditSalarizare(sold, numeBeneficiar);
            case "apartament":
                return new CreditApartament(sold, numeBeneficiar);
            default:
                throw new IllegalArgumentException("Tip de credit inexistent " + tip);

        }

    }

}
