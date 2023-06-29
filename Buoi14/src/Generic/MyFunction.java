package Generic;

/**
 *
 * @author trant
 */
public class MyFunction {
    
//    public static void printArray(Integer[] arr){
//        for(Integer e : arr){
//            System.out.println(e);
//        }
//    }
//    
//    public static void printArray(String[] arr){
//        for(String e : arr){
//            System.out.println(e);
//        }
//    }
    
    public static <T> void printSomething(T thing){
        System.out.println(thing);
        if(thing instanceof String){
            System.out.println("Lower case is: "+ ((String) thing).toLowerCase());
        }
    }
    
    public static <T> void printarray(T[] arr){
        for(T e: arr){
            System.out.println(e);
        }
    }
    
}
