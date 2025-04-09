public class Match {
    private Sport sport;

    public Match(SportFactory factory, String echipaGazda, String echipaOaspete) {
        this.sport = factory.createSport(echipaGazda, echipaOaspete);
    }

    public void start() {
        sport.startMatch();
    }
}