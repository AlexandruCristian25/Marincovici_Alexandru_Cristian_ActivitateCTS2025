public class AirQualitySensor implements AbstractAirQualitySensor {

    private int PM25;
    private int PM10;
    private int VOC;
    private int CO2;
    private int CO;
    private int temperatura;
    private int umiditate;

    AirQualitySensor(int PM25, int PM10, int VOC, int CO2, int CO, int temperatura, int umiditate) { //Package visibility
        this.PM25 = PM25;
        this.PM10 = PM10;
        this.VOC = VOC;
        this.CO2 = CO2;
        this.CO = CO;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "AirQualitySensor{" +
                "PM25=" + PM25 +
                ", PM10=" + PM10 +
                ", VOC=" + VOC +
                ", CO2=" + CO2 +
                ", CO=" + CO +
                ", temperatura=" + temperatura +
                ", umiditate=" + umiditate +
                '}';
    }
}
