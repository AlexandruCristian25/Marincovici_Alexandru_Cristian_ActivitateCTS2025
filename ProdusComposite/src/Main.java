public class Main {
    public static void main(String[] args) {
        Produs p1 = new Produs("Laptop", 10);
        Produs p2 = new Produs("Mouse", 50);
        Produs p3 = new Produs("Tastatura", 30);

        Categorie periferice = new Categorie("Periferice");
        periferice.adauga(p2);
        periferice.adauga(p3);

        Categorie electronice = new Categorie("Electronice");
        electronice.adauga(p1);
        electronice.adauga(periferice); // subcategorie

        electronice.afiseaza();
    }
}
