public class Main {
    public static void main(String[] args) {
        AutobuzStaticData flyweightData = new AutobuzStaticData("Mercedes", 2018, 50);
        Autobuz autobuz = new Autobuz(flyweightData, "Popescu", 8.5f);

        // Salvăm starea inițială
        Autobuz.Memento mem = autobuz.saveToMemento();

        // Modificăm starea
        autobuz.setSofer("Ionescu");
        autobuz.setConsumMediu(9.2f);

        // Revenim la starea salvată
        autobuz.restoreFromMemento(mem);
    }
}
