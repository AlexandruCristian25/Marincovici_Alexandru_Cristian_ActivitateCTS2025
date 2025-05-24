public class Masina {

    private MasinaState currentState;
    public int balance;

    public Masina(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 10) {

            currentState = MasinaState.InReparatie;

        } else {

            currentState = MasinaState.Functionala;
            
        }

    }

    public void StareMasina() {

        if(currentState == MasinaState.Functionala) {

            currentState = MasinaState.Defecta;
            System.out.println("Masina este in reparatie");

        } else {

            System.out.println("Masina este defecta");

        }

    }
    
    public void StareMasina1() {
        
        if(currentState == MasinaState.Functionala) {
            
            currentState = MasinaState.InReparatie;
            System.out.println("Masina este in reparatie");
            
        } else {

            System.out.println("Masina este functionala");
            
        }
        
    }

    public MasinaState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }

    public void balance(int i) {
    }
}
