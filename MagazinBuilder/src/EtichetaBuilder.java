public class EtichetaBuilder {

    private String dataExpirare = "";
    private String importator = "";
    private String ingrediente = "";
    private String gramaj = "";

    public EtichetaBuilder setDataExpirare(String dataExpirare) {

        if(dataExpirare == null) {

            this.dataExpirare = "";

        } else {

            this.dataExpirare = dataExpirare;

        }

        return this;

    }

    public EtichetaBuilder setImportator(String importator) {

        if(importator == null) {

            this.importator = "";

        } else {

            this.importator = importator;

        }

        return this;

    }

    public EtichetaBuilder setIngrediente(String ingrediente) {

        if(ingrediente == null) {

            this.ingrediente = "";

        } else {

            this.ingrediente = ingrediente;

        }

        return this;

    }

    public EtichetaBuilder setGramaj(String gramaj) {

        if(gramaj == null) {

            this.gramaj = "";

        } else {

            this.gramaj = gramaj;

        }

        return this;

    }

    public Eticheta build() {

        return new Eticheta(dataExpirare, importator, ingrediente, gramaj);

    }

}
