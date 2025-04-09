public class Fotbal extends Sport {

    public Fotbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void startMatch() {
        System.out.println("Meci de fotbal între " + echipaGazda + " și " + echipaOaspete);
    }

}