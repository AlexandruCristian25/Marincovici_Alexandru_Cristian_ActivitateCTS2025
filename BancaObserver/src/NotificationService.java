import java.util.List;

public class NotificationService {

    public void sendNotifications(List<Client> clients) {
        for (Client client : clients) {
            if (client.isSubscribedToNotifications()) {
                sendNotification(client);
            }
        }
    }

    private void sendNotification(Client client) {
        System.out.println("Trimitere notificare către: " + client.getName());
    }
}
