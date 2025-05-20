public abstract class Pacient {

    public final void preluarePacient() {

        verificarePacient();
        if(starePacient()) {

            procesarePacient();
            verificareSalon();
            emitereFisaInternare();

        } else {

            verificarePacient();

        }

    }

    protected abstract void verificareSalon();

    protected abstract boolean starePacient();

    protected abstract void verificarePacient();

    protected abstract void procesarePacient();

    protected abstract void emitereFisaInternare();
}
