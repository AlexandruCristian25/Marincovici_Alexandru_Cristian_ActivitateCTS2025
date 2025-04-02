import java.util.ArrayList;
import java.util.List;

public class CameraSupraveghere implements CameraCCTV {

    private List<Administrator> administratori;
    private boolean transmitereImagini;

    public CameraSupraveghere() {
        this.administratori = new ArrayList<>();
        this.transmitereImagini = false; // Implicit, transmisia este dezactivată
    }

    @Override
    public void detecteazaMiscare() {
        String mesaj = "Miscare detectata! Trimitere notificari administratorilor.";
        notificaAdministratori(mesaj);
        if (transmitereImagini) {
            System.out.println("Transmisie imagini activată!");
        }
    }

    @Override
    public void adaugaAdministrator(Administrator admin) {
        administratori.add(admin);
    }

    @Override
    public void stergeAdministrator(Administrator admin) {
        administratori.remove(admin);
    }

    @Override
    public void seteazaTransmitereImagini(boolean activat) {
        this.transmitereImagini = activat;
        System.out.println("Transmiterea de imagini este acum " + (activat ? "activată" : "dezactivată"));
    }

    private void notificaAdministratori(String mesaj) {
        for (Administrator admin : administratori) {
            admin.primesteNotificare(mesaj);
        }
    }

}
