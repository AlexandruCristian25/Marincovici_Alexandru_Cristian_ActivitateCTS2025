public class Main {
    public static void main(String[] args) {
        // 1. Cumpărare directă din farmacie
        MedicamentFarmacie farmacieSimpla = new MedicamentFarmacieImpl();
        farmacieSimpla.cumparaMedicament();

        // 2. Cumpărare prin sistemul spitalului, dar integrat în farmacie
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        MedicamentFarmacie medicamentAdaptat = new AdapterMedicament(medicamentSpital);
        medicamentAdaptat.cumparaMedicament();
    }
}
