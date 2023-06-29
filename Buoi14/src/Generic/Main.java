package Generic;

/**
 * lớp không generic, bên trong lớp này chúng ta có thể định nghĩa các phương thức generic phục vụ cho các vấn đề chung
*/
public class Main {
    
    public static void main(String[] args) {
//        Integer[] arr1 = new Integer[] {1,2,3,4,5};
//        String[] arr2 = new String[] {"hello worl"};
//        MyFunction.printArray(arr1);
//        MyFunction.printArray(arr2);

//        MyFunction.printSomething("hello worl");
//        MyFunction.printSomething(1.1);
//        MyFunction.printSomething(new Student(1, "dat", 29));

//        Integer[] arr1 = new Integer[] {1,2,3,4,5};
//        MyFunction.printarray(arr1);
//        String[] arr2 = new String[] {"hello worl"};
//        MyFunction.printarray(arr2);

        Student[] arr = new Student[]{
          new Student(1, "dat", 2),
            new Student(2, "sad", 12)
        };
        
        MyFunction.printSomething(new Student(1, "dat", 32));
        MyFunction.printSomething("Hello worl");
    }
    
}
