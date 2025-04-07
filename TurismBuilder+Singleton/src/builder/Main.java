package builder;

public class Main {
    public static void main(String[] args) {

        HolidayPackage holidayPackage = new HolidayPackageBuilder().contineCazare("Hotel 3 stele").
                contineTransport("Autocar").contineActivitatiExtra("Vizita muzeu").build();

        System.out.println(holidayPackage);
        System.out.println(holidayPackage.getcazare());
        System.out.println(holidayPackage.getTransport());
        System.out.println(holidayPackage.getActivitatiExtra());

    }
}
