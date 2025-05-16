public class SupaFactory {

    public static Supa creeazaSupa(TipSupa tipSupa, String numeS, double pret) {

        switch (tipSupa) {

            case SupaLeguma:
                return new SupaLegume(numeS, pret);
            case SupaCiuperci:
                return new SupaCiuperci(numeS, pret);
            case SupaVita:
                return new SupaVita(numeS, pret);
            default:
                throw  new IllegalArgumentException("Tip supa inexistenta: " + tipSupa);
        }

    }

}
