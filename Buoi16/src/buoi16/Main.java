package buoi16;

/**
 *
 * @author trant
 */
public class Main {

    public static void main(String[] args) {
        
//        TrienKhaiChucNang trienKhaiChucNang = new TrienKhaiChucNang();
//        trienKhaiChucNang.doSomething();

//        ChucNang obj = new ChucNang() {
//            @Override
//            public void doSomething() {
//                System.out.println("hello ");
//            }
//        };
//        
//        obj.doSomething();
//        
//        ChucNang obj2 = new ChucNang() {
//            @Override
//            public void doSomething() {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        };
        
//        ChucNang obj = () -> {
//            System.out.println("hello");  
//        };
//        
//        obj.doSomething();

//        ChucNang obj = (a,b) -> {
//            return a + b;
//        };
//        System.out.println(obj.sum(3, 4));

        Cong cong = (x,y) -> {
          PhanSo ketqua = new PhanSo(x.tuSo * y.mauSo + y.tuSo * x.mauSo, x.mauSo * y.mauSo);
          return ketqua;
        };
        
        PhanSo a = new PhanSo(3, 5);
        PhanSo b = new PhanSo(6, 11);
        PhanSo ketqua = cong.cong(a, b);
        System.out.println(ketqua);

    }
    
}
