public class NotificatorManager implements Notificator {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("⚠️ Notificare către manager: Clientul '" + client.getNume() +
                "' nu are date de contact. Mesaj: " + mesaj);
    }
}
