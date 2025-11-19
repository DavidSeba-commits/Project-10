package com.unibupay.app;

public class FeeItem {
    private String id;
    private String name;
    private String description;
    private double amount;
    private String feeType; // "TUITION", "ACCOMMODATION", etc.
    private String academicTerm; // "2024-SEM1"
    private boolean isActive;

    // Constructor
    public FeeItem(String id, String name, String description, double amount,
                   String feeType, String academicTerm) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.feeType = feeType;
        this.academicTerm = academicTerm;
        this.isActive = true;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getFeeType() { return feeType; }
    public void setFeeType(String feeType) { this.feeType = feeType; }

    public String getAcademicTerm() { return academicTerm; }
    public void setAcademicTerm(String academicTerm) { this.academicTerm = academicTerm; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    @Override
    public String toString() {
        return String.format("FeeItem{id='%s', name='%s', amount=%.2f, type='%s', term='%s'}",
                id, name, amount, feeType, academicTerm);
    }
}