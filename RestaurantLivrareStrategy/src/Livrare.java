public class Livrare {

    private TipLivrare livrareC;

    public void setLivrare(TipLivrare livrareC) {

        this.livrareC = livrareC;

    }

    public void livreaza() {

        if(livrareC != null) {

            livrareC.tipLivrare();

        } else {

            System.out.println("Nu a fost efectuata nici o livrare");

        }

    }

}
