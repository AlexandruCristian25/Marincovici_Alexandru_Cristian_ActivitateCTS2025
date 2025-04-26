public class ATM {
    private ATMState currentState;
    private int balance;

    public ATM(int initialBalance) {
        this.balance = initialBalance;
        if (initialBalance > 0) {
            currentState = ATMState.NU_ARE_CARD;
        } else {
            currentState = ATMState.NU_ARE_BANI;
        }
    }

    public void insertCard() {
        if (currentState == ATMState.NU_ARE_CARD) {
            currentState = ATMState.ARE_CARD;
            System.out.println("Card introdus.");
        } else {
            System.out.println("Nu se poate introduce cardul în această stare: " + currentState);
        }
    }

    public void enterPin() {
        if (currentState == ATMState.ARE_CARD) {
            currentState = ATMState.ARE_PIN_INTRODUS;
            System.out.println("PIN introdus corect.");
        } else {
            System.out.println("Trebuie întâi introdus cardul.");
        }
    }

    public void withdrawMoney(int amount) {
        if (currentState == ATMState.ARE_PIN_INTRODUS) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Ați retras " + amount + " lei.");
                if (balance == 0) {
                    currentState = ATMState.NU_ARE_BANI;
                    System.out.println("Bancomatul nu mai are bani.");
                }
            } else {
                System.out.println("Fonduri insuficiente.");
            }
        } else {
            System.out.println("Nu puteți retrage bani. Trebuie să introduceți PIN-ul.");
        }
    }

    public void ejectCard() {
        if (currentState == ATMState.ARE_CARD || currentState == ATMState.ARE_PIN_INTRODUS) {
            currentState = ATMState.NU_ARE_CARD;
            System.out.println("Card scos.");
        } else {
            System.out.println("Nu există card de scos.");
        }
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public int getBalance() {
        return balance;
    }
}
