package singleton;

public class Main {
    public static void main(String[] args) throws LicenseException {

        TourismLicense tourismLicense = TourismLicense.getInstance();
        tourismLicense.setLicenseNumber("Licenta1");
        System.out.println(tourismLicense.getLicenseNumber());
        tourismLicense.setLicenseNumber("Licenta2");
        tourismLicense.setLicenseNumber("Licenta3");



    }
}