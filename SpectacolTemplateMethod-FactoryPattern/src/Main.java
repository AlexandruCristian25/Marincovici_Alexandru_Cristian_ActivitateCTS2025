import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IShow> spectacole = Arrays.asList(
                new Teatru("Hamlet", "Teatrul Național", LocalDateTime.of(2025, 5, 5, 19, 30), "Andrei Șerban", Arrays.asList("Actor A", "Actor B")),
                new Concert("Electric Vibes", "Arenele Romane", LocalDateTime.of(2025, 6, 10, 20, 0), "Electronic", Arrays.asList("DJ Alpha", "DJ Beta")),
                new StandUpComedy("Funny Night", "Sala Palatului", LocalDateTime.of(2025, 7, 1, 21, 0), true, Arrays.asList("Comediant 1", "Comediant 2"))
        );

        for (IShow show : spectacole) {
            System.out.println("---- Spectacol: " + show.getName() + " ----");
            show.printDetails();
            System.out.println();
        }
    }
}