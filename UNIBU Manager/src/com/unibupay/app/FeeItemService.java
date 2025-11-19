package com.unibupay.app;

import java.util.ArrayList;
import java.util.List;

public class FeeItemService {
    private final List<FeeItem> feeItems = new ArrayList<>();

    // Add new fee item
    public void addFeeItem(FeeItem feeItem) {
        feeItems.add(feeItem);
        System.out.println("Added fee item: " + feeItem.getName());
    }

    // Display all active fee items
    public void displayAvailableFeeItems() {
        System.out.println("\n=== AVAILABLE FEE ITEMS ===");
        boolean foundActive = false;

        for (FeeItem item : feeItems) {
            if (item.isActive()) {
                System.out.println("• " + item.getName() + " - $" + item.getAmount() +
                        " (" + item.getFeeType() + ") - " + item.getAcademicTerm());
                foundActive = true;
            }
        }

        if (!foundActive) {
            System.out.println("No active fee items available.");
        }
    }

    // Get all active fee items
    public List<FeeItem> getActiveFeeItems() {
        List<FeeItem> activeItems = new ArrayList<>();
        for (FeeItem item : feeItems) {
            if (item.isActive()) {
                activeItems.add(item);
            }
        }
        return activeItems;
    }

    // Find fee item by ID
    public FeeItem findFeeItemById(String id) {
        for (FeeItem item : feeItems) {
            if (item.getId().equals(id) && item.isActive()) {
                return item;
            }
        }
        return null;
    }

    // Deactivate a fee item
    public void deactivateFeeItem(String id) {
        FeeItem item = findFeeItemById(id);
        if (item != null) {
            item.setActive(false);
            System.out.println("Deactivated fee item: " + item.getName());
        } else {
            System.out.println("Fee item not found with ID: " + id);
        }
    }

    // Get total number of active fee items
    public int getActiveFeeItemCount() {
        int count = 0;
        for (FeeItem item : feeItems) {
            if (item.isActive()) {
                count++;
            }
        }
        return count;
    }
}