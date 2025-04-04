public class Eticheta implements  IEticheta {

    private final String dataExpirare;
    private final String importator;
    private final String ingrediente;
    private final String gramaj;

    public Eticheta(String dataExpirare, String importator, String ingrediente, String gramaj) {
        this.dataExpirare = dataExpirare;
        this.importator = importator;
        this.ingrediente = ingrediente;
        this.gramaj = gramaj;
    }

    @Override
    public void printareEticheta() {

        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Eticheta{" +
                "dataExpirare='" + dataExpirare + '\'' +
                ", importator='" + importator + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", gramaj='" + gramaj + '\'' +
                '}';
    }
}
