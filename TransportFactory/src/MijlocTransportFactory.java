public class MijlocTransportFactory {
    public static MijlocTransport creeazaMijlocTransport(TipTransport tip) {
        switch (tip) {
            case AUTOBUZ:
                return new Autobuz();
            case TRAMVAI:
                return new Tramvai();
            case TROLEIBUZ:
                return new Troleibuz();
            default:
                throw new IllegalArgumentException("Tip transport necunoscut");
        }
    }
}
