public class Client {
    private String name;
    private boolean subscribedToNotifications;

    public Client(String name, boolean subscribedToNotifications) {
        this.name = name;
        this.subscribedToNotifications = subscribedToNotifications;
    }

    public boolean isSubscribedToNotifications() {
        return subscribedToNotifications;
    }

    public String getName() {
        return name;
    }
}
