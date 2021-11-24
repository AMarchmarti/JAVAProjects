package org.lasencinas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LateBindingTest {

    @Test
    public static void main(String[] args) {
        LateBindingSuper lbSuper = new LateBindingSuper();
        LateBindingSub lbSub = new LateBindingSub();
        // Will access LateBindingSuper.print()
        lbSuper.print();

        // Will access LateBindingSub.print()
        lbSub.print();

        // Will access LateBindingSub.print()
        ((LateBindingSuper) lbSub).print();

        // Assign the lbSub to lbSuper
        lbSuper = lbSub; // Upcasting

        // Will access LateBindingSub.print() because lbSuper is referring to a LateBindingSub object
        lbSuper.print();

        /**
         * Inside LateBindingSuper.print()
         * Inside LateBindingSub.print()
         * Inside LateBindingSub.print()
         * Inside LateBindingSub.print()
         */
    }
}
