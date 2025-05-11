//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SpitalStaticData mementoData = new SpitalStaticData("Spital1", 7, "Locatie1");
        Spital spital = new Spital(mementoData, "Ionescu", "Rezultat1");

        SpitalStaticData mementoData1 = new SpitalStaticData("Spital2", 5, "Locatie2");
        Spital spital1 = new Spital(mementoData1, "Popescu", "Rezultat2");

        SpitalStaticData mementoData2 = new SpitalStaticData("Spital3", 9, "Locatie3");
        Spital spital2 = new Spital(mementoData2, "Jan", "Rezultat3");

        Spital.Memento memento = spital1.saveToMemento();

        spital.setMedic("Ionescu");
        spital.setRezultat("Rezultat5");

        spital.restoreFromMemento(memento);

    }
}