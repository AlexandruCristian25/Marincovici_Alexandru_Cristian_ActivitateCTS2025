public class Main {

    public static void main(String[] args) {

        CameraSupraveghere camera = new CameraSupraveghere();

        Administrator admin1 = new Administrator("Ion Popescu");
        Administrator admin2 = new Administrator("Maria Ionescu");
        Administrator admin3 = new Administrator("George Vasilescu");

        camera.adaugaAdministrator(admin1);
        camera.adaugaAdministrator(admin2);
        camera.adaugaAdministrator(admin3);

        camera.seteazaTransmitereImagini(true);
        camera.detecteazaMiscare();

    }

}