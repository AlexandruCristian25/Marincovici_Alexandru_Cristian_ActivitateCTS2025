import protocol.ProtocolUrgenta;
import protocol.SpitalDeStat;
import protocol.SpitalPrivat;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Caz la spital de stat ==");
        ProtocolUrgenta cazStat = new SpitalDeStat();
        cazStat.preluareCaz();

        System.out.println("\n== Caz la spital privat ==");
        ProtocolUrgenta cazPrivat = new SpitalPrivat();
        cazPrivat.preluareCaz();
    }
}
