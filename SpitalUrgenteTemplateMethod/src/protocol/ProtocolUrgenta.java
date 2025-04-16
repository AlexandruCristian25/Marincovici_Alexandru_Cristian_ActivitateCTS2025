package protocol;

public abstract class ProtocolUrgenta {

    public final void preluareCaz() {
        verificaSemneVitale();
        if (areSemneGrave()) {
            stabilizarePacient();
            verificaLocSpital();
        } else {
            verificaProgramareMedicFamilie();
        }
    }

    protected abstract void verificaSemneVitale();

    protected abstract boolean areSemneGrave();

    protected abstract void stabilizarePacient();

    protected abstract void verificaLocSpital();

    protected abstract void verificaProgramareMedicFamilie();
}
