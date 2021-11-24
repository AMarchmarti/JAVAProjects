package org.lasencinas;

import org.junit.Test;

public class Manager2Test {
    @Test
    public static void main(String[] args) {
        Manager2 mgr = new Manager2("John Jacobs");
        String name = mgr.getName();
        System.out.println("Manager name: " + name);
    }
}
