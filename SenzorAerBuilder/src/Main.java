public class Main {
    public static void main(String[] args) {

        AbstractAirQualitySensor sensor = new AirQualitySensor.Builder()
                .withPM25(35.4)
                .withCO2(400.0)
                .withTemperature(22.5)
                .withHumidity(45.2)
                .build();

        sensor.displaySensorData();

    }
}