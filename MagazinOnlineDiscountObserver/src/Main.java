import notifications.*;
import notifications.IClient;

public class Main {
    public static void main(String[] args) {
        DiscountManager manager = new DiscountManager();

        IClient client1 = new ClientEmail("Ana", "ana@email.com");
        IClient client2 = new ClientTelefon("Bogdan", "0723456789");
        IClient client3 = new ClientEmail("Carmen", "carmen@email.com");

        manager.aboneazaClient(client1);
        manager.aboneazaClient(client2);
        manager.aboneazaClient(client3);

        manager.trimiteNotificareReducere("Reducere de 50% la toate produsele!");
        manager.dezaboneazaClient(client2);
        manager.trimiteNotificareReducere("Nouă reducere: 20% la electronice!");
    }
}
