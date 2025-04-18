public class Main {
    public static void main(String[] args) {
        Detinator d1 = FlyweightFactory.getDetinator("Ion Popescu", "Str. X", "0712345678", "ion@mail.com");
        Banca b1 = FlyweightFactory.getBanca("BCR", "Cluj", 5000000);

        Cont cont1 = new Cont("RO01BCR123", 1000.0, d1, b1);
        Cont cont2 = new Cont("RO01BCR456", 2500.0, d1, b1); // Reutilizează aceleași obiecte

        cont1.afiseazaCont();
        System.out.println("------------");
        cont2.afiseazaCont();
    }
}
