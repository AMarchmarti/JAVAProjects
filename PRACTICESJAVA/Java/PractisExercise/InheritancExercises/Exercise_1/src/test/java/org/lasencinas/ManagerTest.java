package org.lasencinas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    @Test
    public void testInheritance() {
        // Create an object of the Manager class
        Manager mgr = new Manager();
        // Set the name of the manager
        mgr.setName("Leslie Zanders");
        // Get the name of the manager
        String mgrName = mgr.getName();
        assertEquals("Leslie Zanders", mgr.getName());
        // Display the manager name
        System.out.println("Manager Name: " + mgrName);
    }
}
