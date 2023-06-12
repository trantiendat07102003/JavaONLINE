package buoi08;

/*
    4 tính chất của OOP
*/

public class Buoi08 {

    public static void main(String[] args) {
        /*
            Tinh chất 1: tính đóng gói (encapsulation)
            Đóng gói thuộc tính của đối tượng và cung cấp cho đối tượng đó các getter và setter
        */
        Student student = new Student(1,"dat",21);
        student.setID(21);
        System.out.println(student.getID());
        
        /*
        
            Tính chất 2: Tính kế thừa (inheritance) 
            chỉ có thể đơn kế thừa 
            một lớp kế thừa từ lớp cha được sử dụng lại những thành phần của lớp cha nếu được cho phép
            nếu lớp con có phương thức giống hệt lớp cha thì ta cần phương pháp ghi đè (@overide)
        */
    }
    
}
