public abstract class Sport {
    protected String echipaGazda;
    protected String echipaOaspete;

    public Sport(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    public abstract void startMatch();
}