public class Detinator {

    private String nume;
    private String email;
    private String telefon;

    public Detinator(String nume, String email, String telefon) {
        this.nume = nume;
        this.email = email;
        this.telefon = telefon;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return "Detinator{" +
                "nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
