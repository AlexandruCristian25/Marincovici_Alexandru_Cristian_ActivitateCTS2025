public class NotificatorEmail implements Notificator {
    private Notificator urmator;

    public NotificatorEmail(Notificator urmator) {
        this.urmator = urmator;
    }

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getEmail() != null && !client.getEmail().isEmpty()) {
            System.out.println("Trimitem email către " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.trimiteNotificare(client, mesaj);
        }
    }
}
