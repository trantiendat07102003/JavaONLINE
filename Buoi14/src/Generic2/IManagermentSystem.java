package Generic2;

/**
 *
 * @author trant
 */
public interface IManagermentSystem <T>{
    
    void create(T obj);
    
    T search(int id);
    
    void print();
}
