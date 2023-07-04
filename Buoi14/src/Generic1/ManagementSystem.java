package Generic1;

import java.util.ArrayList;

/**
 *
 * @author trant
 */
public class ManagementSystem <T>{
    
    private ArrayList<T> list;

    public ManagementSystem() {
        this.list = new ArrayList<T>();
    }

    public void create(T obj){
        this.list.add(obj);
    }
    
    public T search(int id){
        for(T e : this.list){
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
    
    public void print(){
        for(T e :this.list){
            System.out.println(e);
        }
    }
    
}
