package buoi08;

public class Employee {
    
    private int id;
    private String nameString;
    private int age;
    private int baseSalary;

    // constructor nay dung de lam gi
    public Employee(int id, String nameString, int age, int baseSalary) {
        this.id = id;
        this.nameString = nameString;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public void print(){
        System.out.println("ten");
    }
}
