package notifications;

public class ClientEmail implements notifications.IClient {
    private String nume;
    private String email;

    public ClientEmail(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Email trimis către " + email + ": " + mesaj);
    }

    @Override
    public String getNume() {
        return nume;
    }
}
