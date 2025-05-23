public class PlataCard implements MetodaPlata {

    private MetodaPlata urmator;

    public PlataCard(MetodaPlata urmator) {
        this.urmator = urmator;
    }

    public PlataCard() {

    }

    @Override
    public void plateste(Pacient pacient, String plata) {

        if (pacient.getCash() != null && !pacient.getCash().isEmpty()) {

            System.out.println("Pacientul " + pacient.getNume() + " va plati cu cardul" + plata);

        } else if (urmator != null) {

            urmator.plateste(pacient, plata);

        }
    }
}
