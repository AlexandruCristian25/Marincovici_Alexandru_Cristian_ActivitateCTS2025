public class Baschet extends Sport {

    public Baschet(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void startMatch() {
        System.out.println("Meci de baschet între " + echipaGazda + " și " + echipaOaspete);
    }
}