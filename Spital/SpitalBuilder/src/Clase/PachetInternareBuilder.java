package Clase;

public class PachetInternareBuilder implements Builder{
    PachetInternare pachet = new PachetInternare(false, false, false, false);

    public PachetInternareBuilder() {
    }

    public PachetInternareBuilder setHasPatRabatabil(boolean patRabatabil) {
        this.pachet.setPatRabatabil(patRabatabil);
        return this;
    }

    public PachetInternareBuilder setHasMicDejun(boolean micDejun) {
        this.pachet.setMicDejun(micDejun);
        return this;
    }

    public PachetInternareBuilder setHasPapuci(boolean papuci) {
        this.pachet.setPapuci(papuci);
        return this;
    }

    public PachetInternareBuilder setHasHalat(boolean halat) {
        this.pachet.setHalat(halat);
        return this;
    }

    public PachetInternare build() {
        return this.pachet;
    }
}
