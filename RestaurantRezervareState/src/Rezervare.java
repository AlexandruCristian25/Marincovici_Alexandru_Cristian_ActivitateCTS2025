public class Rezervare {

    private RezervareState currentState;
    private int balance;

    public RezervareState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }

    public Rezervare(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 0) {

            currentState = RezervareState.REZERVATA;
            System.out.println("Masa este rezervata!");

        } else {

            currentState = RezervareState.OCUPATA;
            System.out.println("Dupa ocupare masa va fi libera!");

        }

    }

    private void rezervareMasa() {
        if(currentState == RezervareState.OCUPATA) {

            currentState = RezervareState.REZERVATA;
            System.out.println("Masa este rezervata!");

        } else {

            currentState = RezervareState.OCUPATA;
            System.out.println("Dupa ocupare masa va fi libera!");

        }

    }

}
