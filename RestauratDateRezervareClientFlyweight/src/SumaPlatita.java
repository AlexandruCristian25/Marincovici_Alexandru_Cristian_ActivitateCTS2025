public class SumaPlatita {

    private String moneda;
    private double suma;

    private Client client;
    private Rezervare rezervare;

    public SumaPlatita(String moneda, double suma, Client client, Rezervare rezervare) {
        this.moneda = moneda;
        this.suma = suma;
        this.client = client;
        this.rezervare = rezervare;
    }

    public void afiseazaSuma() {

        System.out.println("Moneda: " + moneda);
        System.out.println("Client: " + client);
        System.out.println("Rezervare: " + rezervare);

    }
}
