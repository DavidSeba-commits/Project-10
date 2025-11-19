package com.unibupay.app;

public class FeeItemController {
    private final FeeItemService feeItemService;

    public FeeItemController() {
        this.feeItemService = new FeeItemService();
    }

    // Add new fee item
    public void addNewFeeItem(String id, String name, String description,
                              double amount, String feeType, String academicTerm) {
        FeeItem newFeeItem = new FeeItem(id, name, description, amount, feeType, academicTerm);
        feeItemService.addFeeItem(newFeeItem);
    }

    // Display all available fee items
    public void displayAllFeeItems() {
        feeItemService.displayAvailableFeeItems();
    }

    // Get all active fee items for processing
    public void processFeeItems() {
        System.out.println("\nProcessing " + feeItemService.getActiveFeeItemCount() + " active fee items...");
    }
}