package buoi15;

/**
 *
 * @author trant
 */
public class Student {
    
    public /*static*/ class Address{
        
        public int aNumber;
        public String street;
        public String district;
        public String city;

        public Address(int aNumber, String street, String district, String city) {
            this.aNumber = aNumber;
            this.street = street;
            this.district = district;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" + "aNumber=" + this.aNumber + ", street=" + this.street + ", district=" + this.district + ", city=" + this.city + '}';
        }

        public void callToOuterClass(){
            Student.this.greetingFromStudent();
        }
        
    }
    
    public int id;
    public String name;
    public int age;
    public Address address;

    public Student(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", address=" + this.address + '}';
    }
    
    public void greetingFromStudent(){
        System.out.println("hello worl");
    }

}
