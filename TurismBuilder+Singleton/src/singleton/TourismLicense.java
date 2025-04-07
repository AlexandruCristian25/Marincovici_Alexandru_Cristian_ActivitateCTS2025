package singleton;

public class TourismLicense implements AbstractTourismLicense {

    private String licenseNumber;
    private boolean isSet;

    private static TourismLicense instance;
    private TourismLicense() {
    }

    public static synchronized TourismLicense getInstance() {

        if (instance == null) {

            instance = new TourismLicense();

        } else {

            return instance;

        }

        return instance;
    }

    @Override
    public void setLicenseNumber(String licenseNumber) throws LicenseException {

        if(isSet) {

            throw new LicenseException("singleton.TourismLicense is set");

        } else {

            this.licenseNumber = licenseNumber;
            this.isSet = true;

        }

    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
