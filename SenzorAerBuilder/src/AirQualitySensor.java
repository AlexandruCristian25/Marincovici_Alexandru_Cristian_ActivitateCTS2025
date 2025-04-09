public final class AirQualitySensor implements AbstractAirQualitySensor {

    private final Double pm25;
    private final Double pm10;
    private final Double voc;
    private final Double co2;
    private final Double co;
    private final Double temperature;
    private final Double humidity;

    private AirQualitySensor(Builder builder) {
        this.pm25 = builder.pm25;
        this.pm10 = builder.pm10;
        this.voc = builder.voc;
        this.co2 = builder.co2;
        this.co = builder.co;
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
    }

    @Override
    public void displaySensorData() {
        System.out.println("Senzor cu valori:");
        if (pm25 != null) System.out.println("PM2.5: " + pm25);
        if (pm10 != null) System.out.println("PM10: " + pm10);
        if (voc != null) System.out.println("VOC: " + voc);
        if (co2 != null) System.out.println("CO2: " + co2);
        if (co != null) System.out.println("CO: " + co);
        if (temperature != null) System.out.println("Temperatura: " + temperature);
        if (humidity != null) System.out.println("Umiditate: " + humidity);
    }

    public static class Builder {

        private Double pm25;
        private Double pm10;
        private Double voc;
        private Double co2;
        private Double co;
        private Double temperature;
        private Double humidity;

        public Builder withPM25(double value) {
            this.pm25 = value;
            return this;
        }

        public Builder withPM10(double value) {
            this.pm10 = value;
            return this;
        }

        public Builder withVOC(double value) {
            this.voc = value;
            return this;
        }

        public Builder withCO2(double value) {
            this.co2 = value;
            return this;
        }

        public Builder withCO(double value) {
            this.co = value;
            return this;
        }

        public Builder withTemperature(double value) {
            this.temperature = value;
            return this;
        }

        public Builder withHumidity(double value) {
            this.humidity = value;
            return this;
        }

        public AirQualitySensor build() {
            return new AirQualitySensor(this);
        }

    }

}
