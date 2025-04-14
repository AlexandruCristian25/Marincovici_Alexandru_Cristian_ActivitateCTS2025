public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(String denumire, double pret) {
        super(denumire, pret);
    }

    @Override
    public void afiseazaInfo() {
        System.out.println("Raceala - " + denumire + " : " + pret + " RON");
    }
}

