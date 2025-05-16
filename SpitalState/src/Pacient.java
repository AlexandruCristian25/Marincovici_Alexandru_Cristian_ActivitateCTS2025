public class Pacient {

    private PacientState currentstate;
    public int balance;

    public Pacient(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 0) {

            currentstate = PacientState.INTERNAT;

        } else {

            currentstate = PacientState.EXTERNAT;

        }

    }

    public void starePacient1() {

        if(currentstate == PacientState.INTERNAT) {

            currentstate = PacientState.SUBOBSERVATIE;
            System.out.println("Pacientul este intr-o stare grava si pus sub observatie!");

        } else {

            System.out.println("Pacientul a fost externat!");

        }

    }

    public void starePacient2() {

        if(currentstate == PacientState.EXTERNAT) {

            currentstate = PacientState.EXTERNAT;
            System.out.println("Pacientul este vindecat si va fi externat!");

        } else {

            System.out.println("Pacientul nu a fost externat!");

        }

    }

    public PacientState getCurrentstate() {
        return currentstate;
    }

    public int getBalance() {
        return balance;
    }

    public void balance(int i) {
    }
}
