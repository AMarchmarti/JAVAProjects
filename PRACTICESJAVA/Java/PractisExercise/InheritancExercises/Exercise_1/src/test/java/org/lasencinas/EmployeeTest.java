package org.lasencinas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmployeeTest
{

    @Test
    public void testAll() {
        Employee emp = new Employee();
        emp.setName("John Jacobs");
        String empName = emp.getName();
        assertEquals("John Jacobs", emp.getName());
        System.out.println("Employee Name: " + empName);
    }

    @Test
    public void testInstanceOf() {
        Employee emp = new Employee();
        emp.setName("John Jacobs");
        Manager mgr = new Manager();
        mgr.setName("John Jacobs");
        System.out.println(mgr.equals(emp)); // prints true
        System.out.println(emp.equals(mgr)); // prints true
        System.out.println(emp.equals("John Jacobs")); // prints false
    }
}

