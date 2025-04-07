import java.util.List;

public class Pantof {

    private final TipPantof tip;
    private final int numar;
    private final double dimensiuneToc;
    private final String materialBaza;
    private final List<String> materialeSecundare;
    private final List<String> mesaje;

    public Pantof(TipPantof tip, int numar, double dimensiuneToc, String materialBaza,
                  List<String> materialeSecundare, List<String> mesaje) {

        this.tip = tip;
        this.numar = numar;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialeSecundare = materialeSecundare;
        this.mesaje = mesaje;

    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tip=" + tip +
                ", numar=" + numar +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialeSecundare=" + materialeSecundare +
                ", mesaje=" + mesaje +
                '}';
    }
}