public class BaschetFactory extends SportFactory{


    @Override
    public Sport createSport(String echipaGazda, String echipaOaspete) {
        return new Baschet(echipaGazda, echipaOaspete);
    }
}
