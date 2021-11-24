package org.lasencinas;



public class ListEnumConstantsTest {

    public static void main(String[] args) {
        for (Severity s : Severity.values()) {
            String name = s.name();
            int ordinal = s.ordinal();
            System.out.println(name + "(" + ordinal + ")");
        }
    }
}
/**
LOW(0)
MEDIUM(1)
HIGH(2)
URGENT(3)
 */