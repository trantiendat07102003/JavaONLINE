package buoi07;

public class Student {

    // thuộc tính của đối tượng ( object attributes )
    int ID;
    String name;
    int age;
    double math;
    double physic;
    double chemistry;

    // phương thức khởi taoj đối tượng ( object constructors )
    public Student(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }
    
    public Student(int ID, String name, int age, double math, double physic, double chemistry) {
        this(ID, name, age);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    // hành động của đối tượng ( object action )
    public void print(){
        System.out.println("ID: " + this.ID);
        System.out.println("NAME: " + this.name);
        System.out.println("AGE: " + this.age);
        System.out.println("MATH: " + this.math);
        System.out.println("PHYSIC: " + this.physic);
        System.out.println("CHEMISTRY: " + this.chemistry);
    }
    
    public double getAvg(){
        return (this.math + this.chemistry + this.physic)/3;
    }
    
    public String getResult(){
        if(this.getAvg() >= 8){
            return "hoc sinh gioi";
        }else if(this.getAvg() > 6.5){
            return "hoc sinh kha";
        }else if(this.getAvg() > 5){
            return "hoc sinh trung binh";
        }else{
            return "hoc sinh trung binh";
        }
    }
    
}
