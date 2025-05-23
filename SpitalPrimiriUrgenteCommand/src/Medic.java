public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void internare(String pacient) {
        System.out.println(nume + ": Pacientul " + pacient + " va fi internat.");
    }

    public void tratamentImediat(String pacient) {
        System.out.println(nume + ": Pacientul " + pacient + " primește tratament imediat.");
    }
}
