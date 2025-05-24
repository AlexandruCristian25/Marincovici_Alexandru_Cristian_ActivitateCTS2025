public class ReceptionFacade {
    private final TableManager tableManager;
    private final CleaningService cleaningService;
    private final InventoryService inventoryService;

    public ReceptionFacade() {
        this.tableManager = new TableManager();
        this.cleaningService = new CleaningService();
        this.inventoryService = new InventoryService();
    }

    public boolean canSeatCustomer(int tableId) {
        return tableManager.isTableAvailable(tableId) &&
                cleaningService.isTableCleaned(tableId) &&
                inventoryService.hasNapkins(tableId);
    }
}