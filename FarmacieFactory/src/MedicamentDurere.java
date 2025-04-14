public class MedicamentDurere extends Medicament {
    public MedicamentDurere(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Durere - " + denumire + " : " + pret + " RON");
    }
}
