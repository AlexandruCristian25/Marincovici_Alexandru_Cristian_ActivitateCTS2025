public class MedicamentFactory {
    public static Medicament creeazaMedicament(Categorie categorie, String denumire, double pret) {
        switch (categorie) {
            case Raceala:
                return new MedicamentRaceala(denumire, pret);
            case Durere:
                return new MedicamentDurere(denumire, pret);
            case Body:
                return new MedicamentBody(denumire, pret);
            default:
                throw new IllegalArgumentException("Categorie necunoscută: " + categorie);
        }
    }
}
