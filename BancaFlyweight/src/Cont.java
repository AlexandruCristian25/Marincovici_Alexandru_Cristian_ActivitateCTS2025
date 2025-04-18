public class Cont {
    private String numarCont;
    private double suma;

    private Detinator detinator;
    private Banca banca;

    public Cont(String numarCont, double suma, Detinator detinator, Banca banca) {
        this.numarCont = numarCont;
        this.suma = suma;
        this.detinator = detinator;
        this.banca = banca;
    }

    public void afiseazaCont() {
        System.out.println("Cont: " + numarCont + ", suma: " + suma);
        System.out.println("Detinator: " + detinator);
        System.out.println("Banca: " + banca);
    }
}
