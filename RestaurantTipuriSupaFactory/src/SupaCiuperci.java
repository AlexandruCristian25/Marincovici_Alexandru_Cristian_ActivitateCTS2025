public class SupaCiuperci extends Supa {
    public SupaCiuperci(String numeS, double pret) {
        super(numeS, pret);
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Supa - " + numeS + " are pretul de " + pret + " lei");
    }
}
