public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Andrei");
        client1.setMetodaPlata(new PlataCard());
        client1.efectueazaPlata(150.75);

        Client client2 = new Client("Maria");
        client2.setMetodaPlata(new PlataVirament());
        client2.efectueazaPlata(320.00);
    }
}
