import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrei Popescu", true);
        Client client2 = new Client("Maria Ionescu", false);
        Client client3 = new Client("Ioana Georgescu", true);

        List<Client> clients = Arrays.asList(client1, client2, client3);

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotifications(clients);
    }
}
