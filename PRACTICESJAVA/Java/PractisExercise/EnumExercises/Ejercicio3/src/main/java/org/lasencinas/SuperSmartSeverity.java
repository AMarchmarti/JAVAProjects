package org.lasencinas;


public enum SuperSmartSeverity {
    LOW("Low Priority", 30) {
        public double getProjectedCost() {
            return 1000.0;
        }
    }, MEDIUM("Medium Priority", 15) {
        public double getProjectedCost() {
            return 2000.0;
        }
    }, HIGH("High Priority", 7) {
        public double getProjectedCost() {
            return 3000.0;
        }
    }, URGENT("Urgent Priority", 1) {
        public double getProjectedCost() {
            return 5000.0;
        }
    };

    // Declare instance variables
    private String description;
    private int projectedTurnaroundDays;

    // Declare a private constructor (it is not necessary to write the private access modifier).
    SuperSmartSeverity(String description, int projectedTurnaroundDays) {
        this.description = description;
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // Declare a public method to get the turn around days and description.
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }

    public String getDescription() {
        return description;
    }

    // Override the toString() method in the Enum class to return description
    @Override
    public String toString() {
        return getDescription();
    }

    // Provide getProjectedCost() abstract method, so all constants
    // override and provide implementation for it in their body
    public abstract double getProjectedCost();
}
