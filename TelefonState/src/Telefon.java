public class Telefon {

    private TelefonState currentState;
    public int balance;

    public Telefon(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 30) {

            currentState = TelefonState.Incarcat;

        } else {

            currentState = TelefonState.Descarcat;

        }

    }

    public void stareTelefon() {

        if(currentState == TelefonState.SeIncarca) {

            currentState = TelefonState.Incarcat;
            System.out.println("Telefonul se incarca.");

        } else {

            System.out.println("Telefonul este incarcat.");

        }

    }

    public void stareTelefon1() {

        if(currentState == TelefonState.Incarcat) {

            currentState = TelefonState.Descarcat;
            System.out.println("Telefonul este incarcat.");

        } else {

            System.out.println("Telefonul este descarcat.");

        }

    }

    public TelefonState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }

    public void balance(int i) {
    }
}
