public class NotificatorSMS implements Notificator {
    private Notificator urmator;

    public NotificatorSMS(Notificator urmator) {
        this.urmator = urmator;
    }

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client.getTelefon() != null && !client.getTelefon().isEmpty()) {
            System.out.println("Trimitem SMS către " + client.getNume() + ": " + mesaj);
        } else if (urmator != null) {
            urmator.trimiteNotificare(client, mesaj);
        }
    }
}
