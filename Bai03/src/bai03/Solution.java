package bai03;

import java.util.Scanner;

public class Solution {

    int a;
    int b;
    int c;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap he so a = ");
            a = scanner.nextInt();
        } while (a == 0);
        System.out.println("nhap he so b = ");
        b = scanner.nextInt();
        System.out.println("nhap he so c = ");
        c = scanner.nextInt();
    }

}
