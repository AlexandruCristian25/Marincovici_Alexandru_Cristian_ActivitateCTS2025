import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RaportFactory raportFactory = new RaportFactory();

        List<Integer> valoriPM25 = new ArrayList<>();
        valoriPM25.add(15);
        valoriPM25.add(45);
        valoriPM25.add(85);
        for(Integer valori : valoriPM25) {

            AbstractAirQualityReport report = raportFactory.getRaport(valori);
            report.generareRaport();

        }

    }
}