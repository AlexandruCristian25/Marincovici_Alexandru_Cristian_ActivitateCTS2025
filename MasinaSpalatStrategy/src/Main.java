public class Main {
    public static void main(String[] args) {
        MasinaSpalatRufe masina = new MasinaSpalatRufe();

        masina.setProgram(new ProgramBumbac());
        masina.porneste();

        masina.setProgram(new ProgramDelicate());
        masina.porneste();
    }
}
