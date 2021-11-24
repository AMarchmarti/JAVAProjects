package org.lasencinas;

public class LateBindingSub extends LateBindingSuper {
    @Override
    public void print() {
        System.out.println("Inside LateBindingSub.print()");
    }
}
