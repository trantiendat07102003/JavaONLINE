package Generic2;

/**
 * kế thừa generic giúp cho các lớp generic có thể kế thừa đến nhau và yêu cần khi kế thừa đến các
 * lớp generic phải cung cấp kiểu generic cho lớp được kế thừa 
 * @author trant
 */
public class Main {
    
    public static void main(String[] args) {
        
        ManagementSystem<Student> ms = new ManagementSystem<Student>();
        ms.create(new Student(1, "dat", 22));
        ms.print();
        
    }
    
}
