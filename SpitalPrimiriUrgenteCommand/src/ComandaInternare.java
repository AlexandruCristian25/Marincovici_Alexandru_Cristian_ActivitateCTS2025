public class ComandaInternare implements Comanda {
    private Medic medic;
    private String pacient;

    public ComandaInternare(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.internare(pacient);
    }
}
