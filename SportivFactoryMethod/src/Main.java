import jucatori.*;

public class Main {
    public static void main(String[] args) {
        Jucator j1 = FabricaJucator.creeazaJucator(TipJucator.PORTAR);
        Jucator j2 = FabricaJucator.creeazaJucator(TipJucator.FUNDAS);
        Jucator j3 = FabricaJucator.creeazaJucator(TipJucator.ATACANT);

        j1.afiseazaPozitie();
        j2.afiseazaPozitie();
        j3.afiseazaPozitie();
    }
}
