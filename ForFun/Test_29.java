public class Test_29 {
    public static void main(String[] args){
        //harga barang 2000
        System.out.println(beli(5000.0));
        System.out.println(beli(5000));
    }
    public static int beli(int uang){
        return uang-2000;
    }
    public static double beli(double uang){
        return uang-1000;
    }
}