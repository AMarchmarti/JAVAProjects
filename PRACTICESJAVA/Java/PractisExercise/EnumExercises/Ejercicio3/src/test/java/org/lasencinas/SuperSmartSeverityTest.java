package org.lasencinas;


public class SuperSmartSeverityTest {
    public static void main(String[] args) {
        for (SuperSmartSeverity s : SuperSmartSeverity.values()) {
            String name = s.name();
            String desc = s.toString();
            int ordinal = s.ordinal();
            int projectedTurnaroundDays = s.getProjectedTurnaroundDays();
            double projectedCost = s.getProjectedCost();
            System.out.println("name = " + name + ", description = " + desc + ", ordinal = " + ordinal + ", " +
                    "turnaround days = " + projectedTurnaroundDays + ", projected cost = " + projectedCost);
        }
    }
}

/**
 * name = LOW, description = Low Priority, ordinal = 0, turnaround days = 30, projected cost = 1000.0
 * name = MEDIUM, description = Medium Priority, ordinal = 1, turnaround days = 15, projected cost = 2000.0
 * name = HIGH, description = High Priority, ordinal = 2, turnaround days = 7, projected cost = 3000.0
 * name = URGENT, description = Urgent Priority, ordinal = 3, turnaround days = 1, projected cost = 5000.0
 */