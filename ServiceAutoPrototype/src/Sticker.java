public class Sticker implements Cloneable {

    protected String model;
    protected int anFabricatie;
    protected boolean areDiscount;

    public Sticker(IMasina masina) {

        this.model = masina.getModelMasina();
        this.anFabricatie = masina.getAnFabricatie();
        this.areDiscount = masina.isAreDiscount();

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sticker clona = (Sticker) super.clone();
        clona.model = this.model;
        clona.anFabricatie = this.anFabricatie;
        clona.areDiscount = this.areDiscount;

        return clona;
    }

    @Override
    public String toString() {
        return "StickerPrototype{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", areDiscount=" + areDiscount +
                '}';
    }
}
