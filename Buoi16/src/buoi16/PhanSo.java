package buoi16;

/**
 *
 * @author trant
 */
public class PhanSo {
    
    public int tuSo;
    public int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    @Override
    public String toString() {
        return "PhanSo{" + "tuSo=" + tuSo + ", mauSo=" + mauSo + '}';
    }
    
    
}
