import java.util.HashMap;
import java.util.Map;

class MagazinDiscount implements IMagazin {

    private IMagazin magazin;
    private Map<String, Boolean> clientiCuComenzi = new HashMap<>();

    public MagazinDiscount(IMagazin magazin) {
        this.magazin = magazin;
    }

    @Override
    public double calculeazaTotal(String client, double totalCos, String adresa) {

        boolean estePrimaComanda = !clientiCuComenzi.containsKey(client);

        if (estePrimaComanda) {

            totalCos *= 0.9; // Aplică discount de 10%
            clientiCuComenzi.put(client, true);
            System.out.println("[DISCOUNT] Prima comandă pentru " + client + " a primit reducerea de 10%.");

        } else {

            System.out.println("[FĂRĂ DISCOUNT] Comandă normală pentru " + client + ".");

        }

        double totalFinal = magazin.calculeazaTotal(client, totalCos, adresa);
        System.out.println("Total de plată pentru " + client + ": " + totalFinal + " RON\n");
        return totalFinal;

    }
}