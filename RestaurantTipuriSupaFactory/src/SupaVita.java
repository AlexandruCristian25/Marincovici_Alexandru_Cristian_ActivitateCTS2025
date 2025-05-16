public class SupaVita extends Supa{
    public SupaVita(String numeS, double pret) {
        super(numeS, pret);
    }

    @Override
    public void afiseazaInfo() {

        System.out.println("Supa - " + numeS + " are pretul de " + pret + " lei");

    }
}
