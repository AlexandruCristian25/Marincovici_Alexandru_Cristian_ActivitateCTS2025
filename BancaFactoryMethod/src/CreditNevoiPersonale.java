public class CreditNevoiPersonale implements Credit {
    private double suma;
    private int perioadaLuni;

    public CreditNevoiPersonale(double suma, int perioadaLuni) {
        this.suma = suma;
        this.perioadaLuni = perioadaLuni;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Credit de nevoi personale - Suma: " + suma + " RON, Perioada: " + perioadaLuni + " luni");
    }
}

