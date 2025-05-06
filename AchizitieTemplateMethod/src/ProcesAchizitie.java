public abstract class ProcesAchizitie {

    public final void preluareAchizitie() {

        verificaStoc();
        if(existaStoc()) {

            procesareComanda();
            aduceMedicamente();
            incasareBani();
            eliberareBon();

        } else {

            verificareStoc();

        }

    }

    protected abstract boolean existaStoc();

    private void procesareComanda() {
    }

    protected abstract void verificareStoc();

    private void verificaStoc() {
    }

    protected abstract void aduceMedicamente();

    protected abstract void incasareBani();

    protected abstract void eliberareBon();
}
