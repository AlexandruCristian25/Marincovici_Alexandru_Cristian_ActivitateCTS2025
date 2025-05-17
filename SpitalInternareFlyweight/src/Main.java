//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pacient p1 = FlyweightFactory.getPacient("Popescu Ion", "0722113344", "Adresa1");
        Spital s1 = FlyweightFactory.getSpital("Spital1", "Locatie1", 5);

        Salon salon1 = new Salon(10, 5, 20, "Popescu Ion", "Spital1");
        Salon salon2 = new Salon(15, 7, 8, "Alex Vasilescu", "Spital1");
        Salon salon3 = new Salon(15, 7, 8, "Alex Vasilescu", "Spital1");

        salon1.afiseazaSalon();
        System.out.println("=====================");
        salon2.afiseazaSalon();
        System.out.println("=====================");
        salon3.afiseazaSalon();
    }
}