public class BiletSimplu implements Bilet {
    private String meci;

    public BiletSimplu(String meci) {
        this.meci = meci;
    }

    @Override
    public void print() {
        System.out.println("Bilet pentru meciul: " + meci);
    }
}
