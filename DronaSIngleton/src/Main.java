public class Main {
    public static void main(String[] args) {

        Drona drona = Drona.getInstance("Drona1", 2599.99f, 90);
        drona.connect();
        System.out.println(drona);

        Drona drona1 = Drona.getInstance("Drona2", 1999.99f, 75);
        drona.connect();
        System.out.println(drona1);

        if(drona == drona1) {

            System.out.println("Instante corelate");

        }

    }
}