public class CreditIpotecar implements Credit {
    private double suma;
    private int perioadaLuni;

    public CreditIpotecar(double suma, int perioadaLuni) {
        this.suma = suma;
        this.perioadaLuni = perioadaLuni;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Credit ipotecar - Suma: " + suma + " RON, Perioada: " + perioadaLuni + " luni");
    }
}
