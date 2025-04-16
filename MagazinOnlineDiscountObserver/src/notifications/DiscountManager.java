package notifications;

import java.util.ArrayList;
import java.util.List;

public class DiscountManager {
    private List<notifications.IClient> clienti = new ArrayList<>();

    public void aboneazaClient(notifications.IClient client) {
        clienti.add(client);
        System.out.println(client.getNume() + " a fost abonat la notificări.");
    }

    public void dezaboneazaClient(notifications.IClient client) {
        clienti.remove(client);
        System.out.println(client.getNume() + " s-a dezabonat de la notificări.");
    }

    public void trimiteNotificareReducere(String mesaj) {
        System.out.println("Trimitere notificare despre reducere...");
        for (notifications.IClient client : clienti) {
            client.primesteNotificare(mesaj);
        }
    }
}
