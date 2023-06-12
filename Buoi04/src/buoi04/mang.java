package buoi04;

import java.util.Arrays;

public class mang {

    public static void main(String[] args) {

        int[] array = new int[]{1, 23, 4, 5, 6, 7};
         System.out.println(Arrays.toString(array));

        int[] a = new int[]{1, 2, 3, 4};
        int [] b = a.clone();
        b[1] = 100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
 