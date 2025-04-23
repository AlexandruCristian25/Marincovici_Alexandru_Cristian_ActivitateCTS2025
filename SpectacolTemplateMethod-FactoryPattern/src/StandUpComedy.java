import java.time.LocalDateTime;
import java.util.List;

public class StandUpComedy extends Spectacol {
    private boolean limbajLicentios;
    private List<String> comedianti;

    public StandUpComedy(String name, String location, LocalDateTime dateTime, boolean limbajLicentios, List<String> comedianti) {
        super(name, location, dateTime);
        this.limbajLicentios = limbajLicentios;
        this.comedianti = comedianti;
    }

    @Override
    public void printDetails() {
        printBaseInfo();
        System.out.println("Limbaj licențios: " + (limbajLicentios ? "Da" : "Nu"));
        System.out.println("Comedianți: " + String.join(", ", comedianti));
    }
}