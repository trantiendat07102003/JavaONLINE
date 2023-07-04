package buoi15;

/**
 *
 * @author trant
 */
public class Main {
    
    public static void main(String[] args) {
        
        /*
        
        * Nested Class
        
        */
        
        Student student = new Student(1 , "dat", 22, null);
        Student.Address address = student.new Address(1,"12", "asd", "ads");
        student.address = address;
        System.out.println(student.address);
        System.out.println(student);
        
        /*
        
        * Static Nested Class
        
        */
        
//        Student.Address address = new Student.Address(1, "21", "asd", "asdasd");
//        System.out.println(address);
        
    }
    
}
