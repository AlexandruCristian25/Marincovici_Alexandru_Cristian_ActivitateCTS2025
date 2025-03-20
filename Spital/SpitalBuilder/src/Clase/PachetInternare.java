package Clase;

public class PachetInternare {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public PachetInternare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public boolean isPatRabatabil() {
        return this.patRabatabil;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejun() {
        return this.micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public boolean isPapuci() {
        return this.papuci;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public boolean isHalat() {
        return this.halat;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public String toString() {
        return "PachetInternare [patRabatabil=" + this.patRabatabil + ", micDejun=" + this.micDejun + ", papuci=" + this.papuci + ", halat=" + this.halat + "]";
    }
}
