package Generic1;

public class Box<T> {// class generic
    
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box(T value) {
        this.value = value;
    }
    
    public static <T> void printSomething(T thing){// kieu class khong generic
        
    }
    
}
