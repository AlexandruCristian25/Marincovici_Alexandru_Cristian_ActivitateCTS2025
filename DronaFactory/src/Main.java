public class Main {
    public static void main(String[] args) {

        RaportFactory raportFactory = new RaportFactory();

        FieldReport report1 = raportFactory.getRaport("Informare");
        FieldReport report2 = raportFactory.getRaport("Avertizare");
        FieldReport report3 = raportFactory.getRaport("Alertare");

        report1.afiseazaRapport();
        report2.afiseazaRapport();
        report3.afiseazaRapport();

    }
}