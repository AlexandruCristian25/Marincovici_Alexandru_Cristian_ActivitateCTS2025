public class AutobuzStaticData {

    private final String model;
    private final int anFabricatie;
    private final int nrLocuri;

    public AutobuzStaticData(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getModel() {
        return model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

}
