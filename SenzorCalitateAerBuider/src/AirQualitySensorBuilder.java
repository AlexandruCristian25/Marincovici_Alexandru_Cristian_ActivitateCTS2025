public class AirQualitySensorBuilder {

    private int PM25;
    private int PM10;
    private int VOC;
    private int CO2;
    private int CO;
    private int temperatura;
    private int umiditate;

    public AirQualitySensorBuilder setPM25(int PM25) {
        this.PM25 = PM25;
        return this;
    }

    public AirQualitySensorBuilder setPM10(int PM10) {
        this.PM10 = PM10;
        return this;
    }

    public AirQualitySensorBuilder setVOC(int VOC) {
        this.VOC = VOC;
        return this;
    }

    public AirQualitySensorBuilder setCO2(int CO2) {
        this.CO2 = CO2;
        return this;
    }

    public AirQualitySensorBuilder setCO(int CO) {
        this.CO = CO;
        return this;
    }

    public AirQualitySensorBuilder setTemperatura(int temperatura) throws AirQualitySensorException {
        if(temperatura < -20 || temperatura > 40) {

            throw new AirQualitySensorException("Temperatura invalida!");

        }
        this.temperatura = temperatura;
        return this;
    }

    public AirQualitySensorBuilder setUmiditate(int umiditate) throws AirQualitySensorException {
        if(umiditate < 10) {

            throw new AirQualitySensorException("Umiditate invalida!");

        }
        this.umiditate = umiditate;
        return this;
    }

    public AirQualitySensor build() {

        return new AirQualitySensor(PM25, PM10, VOC, CO2, CO, temperatura, umiditate);

    }


}
