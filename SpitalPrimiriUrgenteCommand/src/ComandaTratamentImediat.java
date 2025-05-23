public class ComandaTratamentImediat implements Comanda {
    private Medic medic;
    private String pacient;

    public ComandaTratamentImediat(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.tratamentImediat(pacient);
    }
}
