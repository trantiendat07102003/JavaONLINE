package buoi02.part1;

import java.util.Scanner;

public class Buoi02 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//       scanner.close();
//        int n = scanner.nextInt();
//        System.out.println(n);
//        int a = 10;
//        int temp = a++ + a++;
//        System.out.println(temp);
//        System.out.println(a++ + a++ + 10 + ++a);
//        // 10 + 11          10    11    10    13
////        10 + 11 + 12 + 10 + 13
//        System.out.println(a);

//        int a = 6;
//        int c = 12;
//        boolean temp = a > c;
//        System.out.println(temp);
//        Scanner  scanner = new Scanner(System.in);
//        int id = scanner.nextInt();
//        String Name = scanner.nextLine();
//        System.out.println("id "+id);
//        System.out.println("Name "+ Name);
//        scanner.close();

        int i = 10;
        int i1 = 10;
        System.out.println(System.identityHashCode(i));
        System.out.println(System.identityHashCode(i1));
        System.out.println(i == i1);
    }

}
