package Generic1;

import java.util.Arrays;

/**
 * lớp generic, bên trong lớp này chúng ta có thể định nghĩa các phương thức hay thuộc tính generic phục vụ cho các vấn đề chung
*/
public class Main {
    
    public static void main(String[] args) {
        
//        Box<String>  box = new Box<String>("Hello worl");
//        box.setValue("Dat");
//        System.out.println(box.getValue());

//        Box<Integer> box = new Box<Integer>(10);
//        System.out.println(box.getValue());

        MyList<String> myList = new MyList<String>(5);
        myList.set(1, "Dat");
        myList.set(2, "hello");
        myList.set(3, "asd");
//        myList.print();
        Object[] subList = myList.sub(1, 3);
        System.out.println(Arrays.toString(subList));
        
    }
    
}
