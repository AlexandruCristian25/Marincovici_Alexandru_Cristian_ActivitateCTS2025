public class Reteta {

    private RetetaState currentState;
    public int balance;

    public Reteta(int initialBalance) {

        if(initialBalance > 100) {

            currentState = RetetaState.Solicitata;

        } else {

            currentState = RetetaState.Emisa;

        }

    }
    
    public void stareReteta() {
        
        if(currentState == RetetaState.Solicitata) {
            
            currentState = RetetaState.Emisa;
            System.out.println("Reteta a fost emisa cu succes!");
            
        } else {

            System.out.println("Reteta nu a fost emisa!");
            
        }
        
    }

    public void stareReteta2() {

        if(currentState == RetetaState.Emisa) {

            currentState = RetetaState.Achizitionata;
            System.out.println("Reteta a fost achitata cu succes!");

        } else {

            System.out.println("Reteta nu a fost achitata!");

        }

    }

    public RetetaState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }

    public void balance(int i) {
    }
}
