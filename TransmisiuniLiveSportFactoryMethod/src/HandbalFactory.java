public class HandbalFactory extends SportFactory {
    @Override
    public Sport createSport(String echipaGazda, String echipaOaspete) {
        return new Handbal(echipaGazda, echipaOaspete);
    }
}