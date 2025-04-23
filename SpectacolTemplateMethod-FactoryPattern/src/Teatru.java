import java.time.LocalDateTime;
import java.util.List;

public class Teatru extends Spectacol {
    private String regizor;
    private List<String> actori;

    public Teatru(String name, String location, LocalDateTime dateTime, String regizor, List<String> actori) {
        super(name, location, dateTime);
        this.regizor = regizor;
        this.actori = actori;
    }

    @Override
    public void printDetails() {
        printBaseInfo();
        System.out.println("Regizor: " + regizor);
        System.out.println("Actori: " + String.join(", ", actori));
    }
}