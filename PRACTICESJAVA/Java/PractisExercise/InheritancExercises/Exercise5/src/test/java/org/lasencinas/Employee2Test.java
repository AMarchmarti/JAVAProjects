package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class Employee2Test {
    @Test
    public void testAll() {
        Employee2 emp = new Employee2("John Jacobs");
        emp.setName("John Jacobs");
        String empName = emp.getName();
        assertEquals("John Jacobs", emp.getName());
        System.out.println("Employee Name: " + empName);
    }
}
