public class Main {
    public static void main(String[] args) throws AirQualitySensorException {

        AirQualitySensor airQualitySensor = new AirQualitySensorBuilder()
                .setPM25(10)
                .setPM10(20)
                .setVOC(25)
                .setCO2(62)
                .setCO(58)
                .setTemperatura(50)
                .setUmiditate(12).build();
        airQualitySensor.afiseazaDetalii();


    }
}