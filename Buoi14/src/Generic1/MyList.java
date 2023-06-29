package Generic1;

/**
 *
 * @author trant
 */
public class MyList<T> {
    
    private T[] list;

    public MyList(int size) {
        this.list = (T[]) new Object[size];
    }
    
    public void set(int index, T element){
        this.list[index] = element;
    }
    
    public T get(int index){
        return this.list[index];
    }
    
    public T[] sub(int begin, int end){
        T[] newList = (T[]) new Object[end - begin + 1];
        int index = 0;
        for (int i = begin; i < end; i++) {
            newList[index] = this.list[i];
            index++;
        }
        return newList;
    }
    
    public void print(){
        for(T e: this.list){
            System.out.println(e);
        }
    }
    
}
