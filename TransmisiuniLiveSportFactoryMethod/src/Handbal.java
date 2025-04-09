public class Handbal extends Sport {

    public Handbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void startMatch() {
        System.out.println("Meci de handbal între " + echipaGazda + " și " + echipaOaspete);
    }
}