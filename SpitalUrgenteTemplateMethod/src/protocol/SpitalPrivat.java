package protocol;

public class SpitalPrivat extends ProtocolUrgenta {

    private boolean semneGrave = false;

    @Override
    protected void verificaSemneVitale() {
        System.out.println("Verific semnele vitale... (Spital privat)");
        semneGrave = Math.random() > 0.5;
        System.out.println("Semne grave: " + semneGrave);
    }

    @Override
    protected boolean areSemneGrave() {
        return semneGrave;
    }

    @Override
    protected void stabilizarePacient() {
        System.out.println("Se apelează o echipă externă de medici pentru stabilizare (Spital privat).");
    }

    @Override
    protected void verificaLocSpital() {
        boolean areLoc = Math.random() > 0.5;
        if (areLoc) {
            System.out.println("Loc disponibil în spitalul privat. Se internează pacientul.");
        } else {
            System.out.println("Nu sunt locuri. Se caută loc în alte clinici private.");
        }
    }

    @Override
    protected void verificaProgramareMedicFamilie() {
        System.out.println("Se verifică calendarul clinicii pentru o programare cât mai rapidă.");
    }
}
