package org.lasencinas;

public class AOSub extends AOSuper {

    @Override
    public void print() {
        // Call print() method of AOSuper class
        super.print();

        // Print a message
        System.out.println("Inside AOSub.print()");
    }

    public void callOverridenPrint() {
        // Call print() method of AOSuper class
        super.print();
    }
}
