public class Calator {

    private String nume;
    private boolean isSubscribedToNotificcations;

    public Calator(String nume, boolean isSubscribedToNotificcations) {
        this.nume = nume;
        this.isSubscribedToNotificcations = isSubscribedToNotificcations;
    }

    public boolean isSubscribedToNotificcations() {

        return isSubscribedToNotificcations;

    }

    public String getNume() {
        return nume;
    }
}
