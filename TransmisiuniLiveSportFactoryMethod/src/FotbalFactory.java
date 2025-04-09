public class FotbalFactory extends SportFactory {
    @Override
    public Sport createSport(String echipaGazda, String echipaOaspete) {
        return new Fotbal(echipaGazda, echipaOaspete);
    }
}