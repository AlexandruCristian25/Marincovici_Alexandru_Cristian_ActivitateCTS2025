import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Spectacol implements IShow {
    protected String name;
    protected String location;
    protected LocalDateTime dateTime;

    public Spectacol(String name, String location, LocalDateTime dateTime) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return dateTime.format(formatter);
    }

    protected void printBaseInfo() {
        System.out.println("Titlu: " + name);
        System.out.println("Locație: " + location);
        System.out.println("Data și ora: " + getDateTime());
    }
}