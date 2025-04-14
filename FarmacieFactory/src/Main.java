public class Main {
    public static void main(String[] args) {

        Medicament m1 = MedicamentFactory.creeazaMedicament(Categorie.Raceala, "Parasinus", 12.5);
        Medicament m2 = MedicamentFactory.creeazaMedicament(Categorie.Durere, "Nurofen", 18.0);
        Medicament m3 = MedicamentFactory.creeazaMedicament(Categorie.Body, "Crema hidratanta", 25.5);

        m1.afiseazaInfo();
        m2.afiseazaInfo();
        m3.afiseazaInfo();
        
    }
}