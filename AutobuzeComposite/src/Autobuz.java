public class Autobuz extends AutobuzComponent {
    private String producator;
    private String model;
    private int locuri;

    public Autobuz(String producator, String model, int locuri) {
        this.producator = producator;
        this.model = model;
        this.locuri = locuri;
    }

    public void afiseazaDetalii() {
        System.out.println(producator + " " + model + " - " + locuri + " locuri");
    }
}