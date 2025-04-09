import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Alegerea sportului
        System.out.println("Alege un sport: fotbal, baschet, handbal");
        String sportAles = scanner.nextLine().toLowerCase();

        // Introducerea echipelor
        System.out.println("Introduceți numele echipei gazdă:");
        String echipaGazda = scanner.nextLine();
        System.out.println("Introduceți numele echipei oaspete:");
        String echipaOaspete = scanner.nextLine();

        // Crearea fabricii corespunzătoare
        SportFactory factory = null;
        switch (sportAles) {
            case "fotbal":
                factory = new FotbalFactory();
                break;
            case "baschet":
                factory = new BaschetFactory();
                break;
            case "handbal":
                factory = new HandbalFactory();
                break;
            default:
                System.out.println("Sport invalid!");
                return;
        }

        // Crearea meciului
        Match match = new Match(factory, echipaGazda, echipaOaspete);
        match.start();
    }
}