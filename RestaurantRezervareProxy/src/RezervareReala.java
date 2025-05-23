public class RezervareReala implements Rezervare {
    @Override
    public void faRezervare(String numeClient, int nrPersoane) {
        System.out.println("Rezervare realizată pentru " + numeClient +
                " (" + nrPersoane + " persoane). Vă așteptăm!");
    }
}