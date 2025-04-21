public class MasinaSpalatRufe implements Electrocasnic {
    private ProgramSpalare programCurent;

    public void setProgram(ProgramSpalare program) {
        this.programCurent = program;
    }

    public void porneste() {
        if (programCurent != null) {
            programCurent.ruleazaProgram();
        } else {
            System.out.println("Nu a fost selectat niciun program.");
        }
    }
}