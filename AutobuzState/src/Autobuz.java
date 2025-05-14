public class Autobuz {
    
    private AutobuzState currentState;
    public int balance;
    
    public Autobuz(int initialBalance) {
        
        this.balance = initialBalance;
        if(initialBalance <= 100) {
            
            currentState = AutobuzState.InCursa;
            
        } else {

            currentState = AutobuzState.LaCapatDeLinie;
            
        }
        
    }
    
    public void stareAutobuz1() {
        
        if(currentState == AutobuzState.LaReparat) {
            
            currentState = AutobuzState.LaCapatDeLinie;
            System.out.println("Autobuzul este in service!");
            
        } else {

            System.out.println("Autobuzul este in cursa!");
            
        }
        
    }

    public void stareAutobuz2() {

        if(currentState == AutobuzState.InCursa) {

            currentState = AutobuzState.LaCapatDeLinie;
            System.out.println("Autobuzul este in cursa!");

        } else {

            System.out.println("Autobuzul a ajuns la capat de linie!");

        }

    }

    public AutobuzState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }

    public void balance(int i) {
    }
}
