package org.lasencinas;

public class Manager2 extends Employee2 {

    public Manager2(String name) {
        // Call constructor of Employee2 class explicitly
        super(name);}
/*
     Won't compile
     public class Manager2 extends Employee2 {
        // No code for now }


     public class Manager2 extends Employee2 {
     Injected by the compiler
     public Manager2() {
     super();  // Calls the nonexistent no-args constructor of Employee2 class}
*/


}
