package org.lasencinas;

public enum SmartSeverity {
    LOW(30),            // LOW(projectedTurnAroundDays: 30),
    MEDIUM(15),         // MEDIUM(projectedTurnAroundDays: 15),
    HIGH(7),            // HIGH(projectedTurnAroundDays: 7),
    URGENT(1);          // URGENT(projectedTurnAroundDays: 1);

    // Declare an instance variable
    private int projectedTurnaroundDays;

    // Declare a private constructor. The private modifier access is redundant.
    private
    SmartSeverity(int projectedTurnaroundDays) {
        this.projectedTurnaroundDays = projectedTurnaroundDays;
    }

    // Declare a public method to get the turnaround days
    public int getProjectedTurnaroundDays() {
        return projectedTurnaroundDays;
    }
}