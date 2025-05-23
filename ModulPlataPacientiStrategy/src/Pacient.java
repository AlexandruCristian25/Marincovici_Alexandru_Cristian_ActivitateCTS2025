public class Pacient {

    private String nume;
    private String cardB;
    private String cash;

    public Pacient(String nume, String cardB, String adresa) {
        this.nume = nume;
        this.cardB = cardB;
        this.cash = cash;
    }

    public String getNume() {
        return nume;
    }

    public String getCardB() {
        return cardB;
    }

    public String getCash() {
        return cash;
    }
}
