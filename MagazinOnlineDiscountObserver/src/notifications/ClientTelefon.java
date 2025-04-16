package notifications;

public class ClientTelefon implements notifications.IClient {
    private String nume;
    private String telefon;

    public ClientTelefon(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("SMS trimis către " + telefon + ": " + mesaj);
    }

    @Override
    public String getNume() {
        return nume;
    }
}
