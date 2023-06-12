package buoi06;

import java.util.Random;
import java.util.Arrays;

public class Buoi06 {

    public static void main(String[] args) {

//        Random random = new Random();
//        
//        String dataString = "animal";
//        String encode = "";
//        int [] keys = new int [dataString.length()];
//        for (int i = 0; i < dataString.length(); i++) {
//            int number = random.nextInt(10) + 1;
//            encode += (char)(dataString.charAt(i) + number);
//            keys[i] = number;
//        }
//        System.out.println(encode);
//        System.out.println(Arrays.toString(keys));
//        
//        String decode = "";
//        for (int i = 0; i < encode.length(); i++) {
//            decode += (char )(encode.charAt(i) - keys[i]);
//        }
//        System.out.println(decode);
        String data = "49 32 434 23 43 3";
        Buoi06.extracPrimeNumber(data);
    }

    // tim so nguyen to
    public static int[] extracPrimeNumber(String stringNumber) {
        String[] datas = stringNumber.split("");
        String result = "";
        data_loop:
        for (String data : datas) {
            int number = Integer.parseInt(data);
            if (number <= 1) {
                continue data_loop;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    continue data_loop;
                }
            }
            result += (" " + number);
        }
        String[] results = result.substring(1).split(" ");
        int[] output = new int[results.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.parseInt(results[i]);
        }
        return output;

    }

    // ma hoa van ban
    public static String encode(String data, int[] keys) {
        String encode = "";
        for (int i = 0; i < data.length(); i++) {
            encode += (char) (data.charAt(i) + keys[i]);
        }
        return encode;

    }

    // giai ma van ban
    public static String decode(String data, int[] keys) {
        String decode = "";
        for (int i = 0; i < data.length(); i++) {
            decode += (char) (data.charAt(i) - keys[i]);
        }
        return decode;
    }

    // tao keys 
    public static int[] keys(String data) {
        Random random = new Random();
        int[] keys = new int[data.length()];
        for (int i = 0; i < data.length(); i++) {
            keys[i] = random.nextInt();
        }
        return keys;
    }

    // tim cac so le trong chuoi
    public static String extracOddNumbers(String numberString) {
        String result = "";
        for (int i = 0; i < numberString.length(); i++) {
            int number = numberString.charAt(i) - 48;
            if (number % 2 != 0) {
                result += number;
            }
        }

        return result;
    }
}
