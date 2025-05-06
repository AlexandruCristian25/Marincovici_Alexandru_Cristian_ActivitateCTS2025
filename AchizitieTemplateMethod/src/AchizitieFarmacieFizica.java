public class AchizitieFarmacieFizica extends ProcesAchizitie{

    private boolean existaStoc = true;

    @Override
    protected void verificareStoc() {
        System.out.println("Se verifica stocul.");
    }

    @Override
    protected boolean existaStoc() {
        System.out.println("Se verifică stocul în sistem...");
        return true;
    }

    @Override
    protected void aduceMedicamente() {
        System.out.println("Farmacistul merge în depozit și aduce medicamentele.");
    }

    @Override
    protected void incasareBani() {
        System.out.println("Se încasează banii de la client (cash/card).");
    }

    @Override
    protected void eliberareBon() {
        System.out.println("Se emite bonul fiscal.");
    }
}
