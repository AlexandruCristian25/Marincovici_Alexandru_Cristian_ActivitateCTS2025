public class FiltruAsigurare implements Internare {
    private Internare internare;

    public FiltruAsigurare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.areAsigurare()) {
            internare.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " NU are asigurare. Internarea refuzată.");
        }
    }
}
