package clase;

public class NotaPlata {

    private int idNota;
    private double sumaNota;

    public NotaPlata(int idNota, double sumaNota) {
        super();
        this.idNota = idNota;
        this.sumaNota = sumaNota;
    }

    public void printeazaNota() {
        System.out.println("Nota cu codul "+ idNota + " are o suma de "+ sumaNota);
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public double getSumaNota() {
        return sumaNota;
    }

    public void setSumaNota(double sumaNota) {
        this.sumaNota = sumaNota;
    }

}
