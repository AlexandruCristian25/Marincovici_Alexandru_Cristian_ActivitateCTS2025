public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new ProxyRezervare();

        rezervare.faRezervare("Popescu", 2);
        rezervare.faRezervare("Ionescu", 5);
    }
}