package Generic1;

/**
 *
 * @author trant
 */
public class Computer {
    
    public int id;
    public String name;
    public String cpu;

    public Computer(int id, String name, String cpu) {
        this.id = id;
        this.name = name;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + this.id + ", name=" + this.name + ", cpu=" + this.cpu + '}';
    }
    
    
}
