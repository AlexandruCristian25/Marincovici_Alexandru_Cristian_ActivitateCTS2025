//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MetodaPlata metodaPlata = new PlataCash(

                new PlataCard();

        );

        Pacient p1 = new Pacient("Alin", "card1", "cash1");
        Pacient p2 = new Pacient("Alex", "card2", "cash2");
        Pacient p3 = new Pacient("AAndrei", "card3", "cash3");

        String mesaj = "Alegeti metoda de plata:";

        metodaPlata.plateste(p1, mesaj);
        metodaPlata.plateste(p2, mesaj);
        metodaPlata.plateste(p3, mesaj);

    }
}