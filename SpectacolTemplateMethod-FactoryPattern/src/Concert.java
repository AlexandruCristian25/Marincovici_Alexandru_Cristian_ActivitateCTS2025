import java.time.LocalDateTime;
import java.util.List;

public class Concert extends Spectacol {
    private String genMuzical;
    private List<String> artisti;

    public Concert(String name, String location, LocalDateTime dateTime, String genMuzical, List<String> artisti) {
        super(name, location, dateTime);
        this.genMuzical = genMuzical;
        this.artisti = artisti;
    }

    @Override
    public void printDetails() {
        printBaseInfo();
        System.out.println("Gen muzical: " + genMuzical);
        System.out.println("Artiști: " + String.join(", ", artisti));
    }
}