public class Main {
    public static void main(String[] args) {
        // Creăm lanțul de responsabilitate
        Notificator notificator = new NotificatorSMS(
                new NotificatorEmail(
                        new NotificatorManager()
                )
        );

        // Cazuri de test:
        Client client1 = new Client("Ana", "0722000111", "ana@email.com"); // SMS
        Client client2 = new Client("Mihai", null, "mihai@email.com"); // Email
        Client client3 = new Client("Ion", null, null); // Manager

        String mesaj = "Avem oferte speciale pentru tine!";

        notificator.trimiteNotificare(client1, mesaj);
        notificator.trimiteNotificare(client2, mesaj);
        notificator.trimiteNotificare(client3, mesaj);
    }
}
