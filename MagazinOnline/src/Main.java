public class Main {
    public static void main(String[] args) {

        IMagazin magazin = new Magazin();
        IMagazin magazinCuDiscount = new MagazinDiscount(magazin);

        // Client 1: Ion Popescu - 3 comenzi
        System.out.println("=== Comenzi pentru Ion Popescu ===");
        magazinCuDiscount.calculeazaTotal("Ion Popescu", 100, "local");
        magazinCuDiscount.calculeazaTotal("Ion Popescu", 150, "local");
        magazinCuDiscount.calculeazaTotal("Ion Popescu", 200, "extern");

        // Client 2: Maria Ionescu - 3 comenzi
        System.out.println("=== Comenzi pentru Maria Ionescu ===");
        magazinCuDiscount.calculeazaTotal("Maria Ionescu", 250, "extern");
        magazinCuDiscount.calculeazaTotal("Maria Ionescu", 300, "local");  //
        magazinCuDiscount.calculeazaTotal("Maria Ionescu", 400, "extern"); //

    }
}