//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sectiune s1 = new Sectiune("Tribuna", 5);
        Sectiune s2 = new Sectiune("Peluza", 7);
        Sectiune s3 = new Sectiune("VIP", 9);

        Categorie sectiune = new Categorie("Tribuna Nord");
        sectiune.adauga(s1);

        Categorie subsectiune = new Categorie("Peluza Copii");
        subsectiune.adauga(s2);

        Categorie sectiune1 = new Categorie("VIP");
        sectiune1.adauga(s3);
        sectiune1.adauga(sectiune);

        sectiune.afisare();
        subsectiune.afisare();
        sectiune1.afisare();

    }
}