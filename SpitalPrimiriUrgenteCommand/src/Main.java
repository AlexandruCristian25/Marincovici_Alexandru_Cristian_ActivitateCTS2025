public class Main {
    public static void main(String[] args) {
        Medic medic1 = new Medic("Dr. Popescu");
        Medic medic2 = new Medic("Dr. Ionescu");

        OperatorTriaj triaj = new OperatorTriaj();

        triaj.adaugaComanda(new ComandaTratamentImediat(medic1, "Ionel"));
        triaj.adaugaComanda(new ComandaInternare(medic2, "Maria"));
        triaj.adaugaComanda(new ComandaTratamentImediat(medic1, "George"));

        System.out.println("=== Încep procesarea comenzilor de la triaj ===");
        triaj.proceseazaComenzi();
    }
}
