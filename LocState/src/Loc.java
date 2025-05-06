public class Loc {

    private LocState currentState;
    private int balance;

    public Loc(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 0) {

            currentState = LocState.REZERVAT;

        } else {

            currentState = LocState.OCUPAT;

        }

    }

    public void rezervareLoc() {

        if(currentState == LocState.REZERVAT) {

            currentState = LocState.OCUPAT;
            System.out.println("Locul este ocupat");


        } else {

            System.out.println("Nu poate fi ocupat acest loc!");

        }

    }

    public void asezareLoc() {

        if(currentState == LocState.LIBER) {

            currentState = LocState.OCUPAT;
            System.out.println("Acest loc a fost ocupat!");

        } else {


            System.out.println("Locul trebuie sa fie rezervat!");
        }

    }

    public LocState getCurrentState() {

        return  currentState;

    }

    public  int getBalance() {

        return  balance;

    }

}
