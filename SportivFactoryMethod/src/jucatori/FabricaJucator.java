package jucatori;

public class FabricaJucator {

    public static Jucator creeazaJucator(TipJucator tip) {
        switch (tip) {
            case PORTAR:
                return new Portar();
            case FUNDAS:
                return new Fundas();
            case ATACANT:
                return new Atacant();
            default:
                throw new IllegalArgumentException("Tip de jucător necunoscut: " + tip);
        }
    }
}
