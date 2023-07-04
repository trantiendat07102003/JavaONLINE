package Generic2;

import java.util.ArrayList;

/**
 *
 * @author trant
 */
public class ManagementSystem<T> implements IManagermentSystem<T> {
    
    private ArrayList<T> list;
    
    public ManagementSystem() {
        this.list = new ArrayList<T>();
    }
    
    @Override
    public void create(T obj) {
        this.list.add(obj);
    }
    
    @Override
    public T search(int id) {
        for (T e : this.list) {
            if (e instanceof Student) {
                if (((Student) e).id == id) {
                    return e;
                }
            }
            
            if (e instanceof Computer) {
                if (((Computer) e).id == id) {
                    return e;
                }
            }
        }
        return null;
    }
    
    @Override
    public void print() {
        for (T e : this.list) {
            System.out.println(e);
        }
    }
    
}
