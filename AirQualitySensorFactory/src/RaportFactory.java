public class RaportFactory {

    public AbstractAirQualityReport getRaport(int PM25) {

        if(PM25 < 30) {

            return new RaportAerCurat();

        } else if (PM25 <= 70) {

            return new RaportAvertizare();

        } else {

            return new RaportRisc();

        }

    }

}
