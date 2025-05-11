public class InternareSpital implements Internare {
    @Override
    public void interneaza(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost internat.");
    }
}
