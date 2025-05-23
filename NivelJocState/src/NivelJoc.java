public class NivelJoc {

    private JocNivelState currentState;
    public int balance;

    public NivelJoc(int initialBalance) {

        this.balance = initialBalance;
        if(initialBalance > 5) {

            currentState = JocNivelState.NivelInceput;

        } else {

            currentState = JocNivelState.NivelTerminat;

        }

    }

    public void stareNivelJoc() {

        if(currentState == JocNivelState.NivelInCurs) {

            currentState = JocNivelState.NivelTerminat;
            System.out.println("Nivelul a fost terminat");

        } else {

            System.out.println("Nivelul este in curs");

        }

    }

    public void stareNivelJoc1() {

        if(currentState == JocNivelState.NivelInceput) {

            currentState = JocNivelState.NivelTerminat;
            System.out.println("Nivel inceput");

        } else {

            System.out.println("Nivel terminat");

        }

    }

    public void balance(int i) {
    }
}
