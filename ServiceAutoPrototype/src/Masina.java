public class Masina implements IMasina{

    private String model;
    private int anFabricatie;
    private boolean areDiscount;

    public Masina(String model, int anFabricatie, boolean areDiscount) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.areDiscount = areDiscount;
    }

    @Override
    public String getModelMasina() {
        return model;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }

    public boolean isAreDiscount() {
        return areDiscount;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", areDiscount=" + areDiscount +
                '}';
    }
}
