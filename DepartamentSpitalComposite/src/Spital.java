public class Spital implements ISpital {

    private String nume;
    private int nrMedici;

    public Spital(String nume, int nrMedici) {
        this.nume = nume;
        this.nrMedici = nrMedici;
    }

    @Override
    public void afisare() {
        System.out.println("Spitalul " + nume + " are" + " " + nrMedici + " nr medici.");
    }

    @Override
    public int getNrMedici() {
        return nrMedici;
    }
}
