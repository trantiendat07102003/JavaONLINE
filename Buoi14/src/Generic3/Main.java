package Generic3;

import java.util.ArrayList;

/**
 * - <? extends className> sẽ cho phép nhận vào các đối tượng có kiểu dữ liệu là
 * chính className hoặc kiểu kế thừa từ className
 * - <? super className> cho phép nhận vào các đối tượng có kiểu dữ liệu là chính className 
 * hoặc là kiểu cha của className
 * @author trant
 */
public class Main {

    public static void main(String[] args) {

//        ArrayList<Worker> list = new ArrayList<>();
//        list.add(new Worker());
//        list.add(new Worker());
//        list.add(new FullTimeWorker());
//        MyFunction.print(list);

//        ArrayList<Person> list = new ArrayList<>();
//        list.add(new Person());
//        list.add(new Person());
//        list.add(new FullTimeWorker());
//        MyFunction.print(list);
        
//        ArrayList<Person> list = new ArrayList<>();
//        list.add(new Person());
//        list.add(new Person());
//        list.add(new FullTimeWorker());
//        MyFunction.print(list);

        Box<Worker> box = new Box<>(new Worker());
        Box<FullTimeWorker> box1 = new Box<>(new FullTimeWorker());
        
    }

}
