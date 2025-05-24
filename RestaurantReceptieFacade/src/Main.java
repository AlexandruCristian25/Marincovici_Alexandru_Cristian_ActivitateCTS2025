public class Main {
    public static void main(String[] args) {
        ReceptionFacade reception = new ReceptionFacade();

        int[] tableIds = {1, 2, 3, 4, 5, 6};
        for (int tableId : tableIds) {
            System.out.println("Verificare pentru masa " + tableId + ":");
            if (reception.canSeatCustomer(tableId)) {
                System.out.println("Clientul poate fi așezat la masa " + tableId + ".\n");
            } else {
                System.out.println("Masa " + tableId + " nu este pregătită.\n");
            }
        }
    }
}