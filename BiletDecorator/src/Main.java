public class Main {
    public static void main(String[] args) {
        // Bilet fără echipa gazdă
        Bilet bilet1 = new BiletSimplu("Steaua vs Dinamo");
        bilet1.print();

        System.out.println("----");

        // Bilet cu mesaj de susținere (echipa gazdă joacă)
        Bilet bilet2 = new BiletCuMesajSuport(new BiletSimplu("CFR Cluj vs Rapid"), true);
        bilet2.print();
    }
}
