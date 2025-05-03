public class Main {
    public static void main(String[] args) {
        AutobuzComponent a1 = new Autobuz("Mercedes", "Sprinter", 10);
        AutobuzComponent a2 = new Autobuz("Iveco", "Daily", 10);
        AutobuzComponent a3 = new Autobuz("Setra", "S315", 30);
        AutobuzComponent a4 = new Autobuz("Volvo", "9700", 50);

        GrupAutobuze grupMic = new GrupAutobuze("Grup Mic");
        grupMic.adauga(a1);
        grupMic.adauga(a2);

        GrupAutobuze grupMediu = new GrupAutobuze("Grup Mediu");
        grupMediu.adauga(a3);

        GrupAutobuze grupMare = new GrupAutobuze("Grup Mare");
        grupMare.adauga(a4);

        GrupAutobuze flota = new GrupAutobuze("Flota Companiei");
        flota.adauga(grupMic);
        flota.adauga(grupMediu);
        flota.adauga(grupMare);

        flota.afiseazaDetalii();
    }
}
