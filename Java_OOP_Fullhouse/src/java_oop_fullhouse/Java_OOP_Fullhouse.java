package java_oop_fullhouse;

import jdk.jfr.DataAmount;


public class Java_OOP_Fullhouse {

    
    public static void main(String[] args) {
        Employee s1 = new Employee(12, "Dat", 21, 213123);
        s1.printInformation();
        
        Employee s2 = new Employee();
        System.out.println();
        s2.copy();
        s2.setID(-1);
        s2.printInformation();
    }
    
}
