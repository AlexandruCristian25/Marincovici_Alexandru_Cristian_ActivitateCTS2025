import java.util.List;

public class PantofBuilder {

    private TipPantof tip;
    private int numar;
    private double dimensiuneToc;
    private String materialBaza;
    private List<String> materialeSecundare;
    private List<String> mesaje;

    public PantofBuilder setTip(TipPantof tip) {

        this.tip = tip;
        return this;

    }

    public PantofBuilder setNumar(int numar) {

        this.numar = numar;
        return this;

    }

    public PantofBuilder setDimensiuneToc(double dimensiuneToc) {

        this.dimensiuneToc = dimensiuneToc;
        return this;

    }

    public PantofBuilder setMaterialBaza(String materialBaza) {

        this.materialBaza = materialBaza;
        return this;

    }

    public PantofBuilder setMaterialeSecundare(List<String> materialeSecundare) {

        this.materialeSecundare = materialeSecundare;
        return this;

    }

    public PantofBuilder setMesaje(List<String> mesaje) {

        this.mesaje = mesaje;
        return this;

    }

    public Pantof build() throws PantofException {

        if (numar < 35 || numar > 45) {

            throw new PantofException("Numărul pantofului trebuie să fie între 35 și 45.");

        }

        if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {

            throw new PantofException("Dimensiunea tocului trebuie să fie între 0.5 și 12.5.");

        }

        if (materialBaza == null || materialBaza.isEmpty()) {

            throw new PantofException("Materialul de bază este obligatoriu.");

        }

        if (tip == TipPantof.STILETTO && materialeSecundare != null && materialeSecundare.size() > 2) {

            throw new PantofException("Pantofii stiletto permit maxim 2 materiale secundare.");

        }


        if (mesaje != null) {

            int lungimeMesaje = mesaje.stream().mapToInt(String::length).sum();
            if (lungimeMesaje >= numar) {

                throw new PantofException("Lungimea totală a mesajelor trebuie să fie mai mică decât numărul pantofului.");

            }

        }

        return new Pantof(tip, numar, dimensiuneToc, materialBaza, materialeSecundare, mesaje);

    }
}