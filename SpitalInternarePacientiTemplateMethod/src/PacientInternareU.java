public class PacientInternareU extends Pacient {

    public String starePacient;

    @Override
    protected void verificarePacient() {

        System.out.println("Se verifica pacientul!");

    }

    @Override
    protected boolean starePacient() {

        System.out.println("Se verifica starea pacientului!");
        return true;

    }

    @Override
    protected void procesarePacient() {

        System.out.println("Se proceseaza pacientul!");

    }

    @Override
    protected void verificareSalon() {

        System.out.println("Se verifica salonul disponibil!");

    }

    @Override
    protected void emitereFisaInternare() {

        System.out.println("Se emite fisa de internare!");

    }
}
