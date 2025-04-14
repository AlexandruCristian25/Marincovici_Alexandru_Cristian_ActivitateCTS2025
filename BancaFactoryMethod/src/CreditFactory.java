public class CreditFactory {
    public static Credit creeazaCredit(String tip, double suma, int perioadaLuni) {
        switch (tip.toLowerCase()) {
            case "nevoi":
                return new CreditNevoiPersonale(suma, perioadaLuni);
            case "ipotecar":
                return new CreditIpotecar(suma, perioadaLuni);
            default:
                throw new IllegalArgumentException("Tip necunoscut de credit: " + tip);
        }
    }
}
