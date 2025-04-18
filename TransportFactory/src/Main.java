public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = MijlocTransportFactory.creeazaMijlocTransport(TipTransport.AUTOBUZ);
        MijlocTransport tramvai = MijlocTransportFactory.creeazaMijlocTransport(TipTransport.TRAMVAI);
        MijlocTransport troleibuz = MijlocTransportFactory.creeazaMijlocTransport(TipTransport.TROLEIBUZ);

        autobuz.afiseazaTip();
        tramvai.afiseazaTip();
        troleibuz.afiseazaTip();
    }
}
