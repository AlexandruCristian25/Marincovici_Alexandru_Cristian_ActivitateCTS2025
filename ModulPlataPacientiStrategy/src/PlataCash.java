public class PlataCash implements MetodaPlata{

    private MetodaPlata urmator;

    public PlataCash(MetodaPlata urmator) {
        this.urmator = urmator;
    }

    @Override
    public void plateste(Pacient pacient, String plata) {

        if(pacient.getCardB() != null && !pacient.getCardB().isEmpty()) {

            System.out.println("Pacientul " + pacient.getNume() + " va plati cash" + plata);

        } else if(urmator != null) {

            urmator.plateste(pacient, plata);

        }

    }
}
