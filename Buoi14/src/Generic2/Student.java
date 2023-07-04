package Generic2;

import java.util.Objects;

/**
 *
 * @author trant
 */
public class Student {
    
    public int id;
    public String name;
    public int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + this.id + ", name=" + this.name + ", age=" + this.age + '}';
    }

    
}
