public class Reteta implements IReteta {

    private String tipReteta;
    private int nrPastile;
    private boolean areDiscount;

    public Reteta(String tipReteta, int nrPastile, boolean areDiscount) {
        this.tipReteta = tipReteta;
        this.nrPastile = nrPastile;
        this.areDiscount = areDiscount;
    }



    @Override
    public String toString() {
        return "Reteta{" +
                "tipReteta='" + tipReteta + '\'' +
                ", nrPastile=" + nrPastile +
                ", areDiscount=" + areDiscount +
                '}';
    }

    @Override
    public String getTipReteta() {
        return "";
    }

    @Override
    public int getNrPastile() {
        return 0;
    }

    @Override
    public boolean getAreDiscount() {
        return false;
    }
}
