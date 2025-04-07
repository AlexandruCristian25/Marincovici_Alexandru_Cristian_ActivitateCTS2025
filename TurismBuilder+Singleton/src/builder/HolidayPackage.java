package builder;

public class HolidayPackage implements  AbstractHolidayPackage{

    private final String transport;
    private final String cazare;
    private final String activitatiExtra;

    public HolidayPackage(String transport, String cazare, String activitatiExtra) {
        this.transport = transport;
        this.cazare = cazare;
        this.activitatiExtra = activitatiExtra;
    }


    @Override
    public String getTransport() {
        return transport;
    }

    @Override
    public String getcazare() {
        return cazare;
    }

    @Override
    public String getActivitatiExtra() {
        return activitatiExtra;
    }

    @Override
    public String toString() {
        return "builder.HolidayPackage{" +
                "transport='" + transport + '\'' +
                ", cazare='" + cazare + '\'' +
                ", activitatiExtra='" + activitatiExtra + '\'' +
                '}';
    }
}
