package Generic3;

import java.util.ArrayList;

/**
 *
 * @author trant
 */
public class MyFunction {
    
//    public static void print(ArrayList<? extends Worker> list){
//        for(Worker e : list){
//            System.out.println(e);
//        }
//    }
    
    public static void print(ArrayList<? super Worker> list){
        for(Object e : list){
            System.out.println(e);
        }
    }
    
}
