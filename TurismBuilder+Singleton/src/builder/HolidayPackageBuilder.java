package builder;

public class HolidayPackageBuilder {

    private String transport;
    private String cazare;
    private String activitatiExtra;

    public HolidayPackageBuilder contineCazare(String cazare) {

        this.cazare = cazare;
        return this;

    }

    public HolidayPackageBuilder contineTransport(String transport) {

        this.transport = transport;
        return this;

    }

    public HolidayPackageBuilder contineActivitatiExtra(String activitatiExtra) {

        this.activitatiExtra = activitatiExtra;
        return this;

    }

    public HolidayPackage build() {

        return new HolidayPackage(transport, cazare, activitatiExtra);

    }

}
