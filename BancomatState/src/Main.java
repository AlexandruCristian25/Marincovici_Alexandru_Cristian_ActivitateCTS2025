public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(500);

        atm.insertCard();
        atm.enterPin();
        atm.withdrawMoney(200);
        atm.ejectCard();

        atm.insertCard();
        atm.enterPin();
        atm.withdrawMoney(300);
        atm.ejectCard();

        atm.insertCard();
    }
}
