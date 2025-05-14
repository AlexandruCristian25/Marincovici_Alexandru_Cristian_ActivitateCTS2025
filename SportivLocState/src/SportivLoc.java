public class SportivLoc {

    private SportivLocState currentState;
    public int balance;

    public SportivLoc(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance <= 50) {

            currentState = SportivLocState.Liber;

        } else {

            currentState = SportivLocState.Ocupat;

        }

    }

    public void stareLoc1() {

        if(currentState == SportivLocState.Rezervat) {

            currentState = SportivLocState.Ocupat;
            System.out.println("Locul este rezervat!");

        } else {

            System.out.println("Locul a fost eliberat!");

        }

    }

    public void stareLoc2() {

        if(currentState == SportivLocState.Ocupat) {

            currentState = SportivLocState.Liber;
            System.out.println("Locul este ocupat!");

        } else {

            System.out.println("Locul a fost eliberat!");

        }

    }

    public void balance(int i) {
    }
}
