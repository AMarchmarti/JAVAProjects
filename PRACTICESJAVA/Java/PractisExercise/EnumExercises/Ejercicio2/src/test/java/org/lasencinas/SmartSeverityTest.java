package org.lasencinas;


public class SmartSeverityTest {
    public static void main(String[] args) {
        for (SmartSeverity s : SmartSeverity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            int days = s.getProjectedTurnaroundDays();
            System.out.println("name=" + name + ", ordinal=" + ordinal + ", days=" + days);
        }
    }
}

/**
 * name=LOW, ordinal=0, days=30
 * name=MEDIUM, ordinal=1, days=15
 * name=HIGH, ordinal=2, days=7
 * name=URGENT, ordinal=3, days=1
 */