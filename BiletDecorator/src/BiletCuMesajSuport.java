public class BiletCuMesajSuport implements Bilet {
    private Bilet bilet;
    private boolean esteGazda;

    public BiletCuMesajSuport(Bilet bilet, boolean esteGazda) {
        this.bilet = bilet;
        this.esteGazda = esteGazda;
    }

    @Override
    public void print() {
        bilet.print();
        if (esteGazda) {
            System.out.println("Hai echipa gazdă! Suntem alături de voi!");
        }
    }
}
