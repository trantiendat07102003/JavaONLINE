package buoi07;

public class Buoi07 {

    public static void main(String[] args) {

        Student std = new Student(1, "DAT", 21, 9, 8, 7);
//        System.out.println("ID: " + std.ID);
//        System.out.println("NAME: " + std.name);
//        System.out.println("AGE: " + std.age);
//        System.out.println("MATH: " + std.math);
//        System.out.println("PHYSIC: " + std.physic);
//        System.out.println("CHEMISTRY: " + std.chemistry);

        std.print();
        System.out.println();
        Student std1 = new Student(3, "DAT", 21, 9, 8, 7);
        System.out.println("AVG: "+ std1.getAvg());
        System.out.println("Result: "+std1.getResult());
        std1.print();
        
    }

}
