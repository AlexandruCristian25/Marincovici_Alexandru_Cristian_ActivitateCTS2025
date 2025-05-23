//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sectiune s1 = new Sectiune("Mezeluri", 5);
        Sectiune s2 = new Sectiune("Prajituri", 7);
        Sectiune s3 = new Sectiune("Apa plata", 9);

        Categorie aperitive = new Categorie("Aperitive");
        aperitive.adauga(s1);

        Categorie desert = new Categorie("Desert");
        desert.adauga(s2);

        Categorie bauturi = new Categorie("Bauturi");
        bauturi.adauga(s3);
        bauturi.adauga(aperitive);

        aperitive.afisare();
        desert.afisare();
        bauturi.afisare();

    }
}