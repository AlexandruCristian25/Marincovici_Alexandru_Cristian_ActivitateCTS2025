public class MedicamentBody extends Medicament {
    public MedicamentBody(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Body - " + denumire + " : " + pret + " RON");
    }
}
