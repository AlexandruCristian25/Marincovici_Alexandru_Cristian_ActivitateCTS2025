public class Sportiv {

    private SportivState currentState;
    public  int balance;

    public Sportiv(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 10) {

            currentState = SportivState.Inert;

        } else {

            currentState = SportivState.Jogging;

        }

    }

    public void stareSportiv() {

        if(currentState == SportivState.Jogging) {

            currentState = SportivState.Jogging;
            System.out.println("Sportivul face jogging");

        } else {

            System.out.println("Sportivul alearga");

        }

    }

    public void stareSportiv1() {

        if(currentState == SportivState.Alearga) {

            currentState = SportivState.Inert;
            System.out.println("Sportivul alearga");

        } else {

            System.out.println("Sportivul este inert");

        }

    }

    public void balance(int i) {
    }
}
