package protocol;

public class SpitalDeStat extends ProtocolUrgenta {

    private boolean semneGrave = false;

    @Override
    protected void verificaSemneVitale() {
        System.out.println("Verific semnele vitale... (Spital de stat)");
        semneGrave = Math.random() > 0.5; // simulare
        System.out.println("Semne grave: " + semneGrave);
    }

    @Override
    protected boolean areSemneGrave() {
        return semneGrave;
    }

    @Override
    protected void stabilizarePacient() {
        System.out.println("Se intervine cu echipa internă de medici pentru stabilizare (Spital de stat).");
    }

    @Override
    protected void verificaLocSpital() {
        boolean areLoc = Math.random() > 0.5;
        if (areLoc) {
            System.out.println("Loc disponibil în spital. Se internează pacientul.");
        } else {
            System.out.println("Nu sunt locuri. Se caută loc în alte spitale de stat.");
        }
    }

    @Override
    protected void verificaProgramareMedicFamilie() {
        System.out.println("Se caută cea mai apropiată programare disponibilă la medicul de familie.");
    }
}
