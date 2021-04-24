import java.util.Scanner;

public class Lab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.println(c+" + "+d+" = "+tambah(c, d));
        System.out.println(c+" - "+d+" = "+kurang(c, d));
        System.out.println(c+" X "+d+" = "+kali(c, d));
        System.out.println(c+" / "+d+" = "+bagi(c, d));

        kalkulator(c, d);
    }

    public static void kalkulator (double a, double b){
        System.out.println("sekarang di method kalkulator");
        System.out.println(tambah ( a,  b));
        System.out.println(kurang ( a,  b));
        System.out.println(kali ( a,  b));
        System.out.println(bagi ( a,  b));
    }

    public static double tambah (double a, double b){
        System.out.println("melakukan tambah");
        return a + b;
    }
    public static double kurang (double a, double b){
        System.out.println("melakukan kurang");
        return a - b;
    }
    public static double kali (double a, double b){
        System.out.println("melakukan kali");
        return a * b;
    }
    public static double bagi (double a, double b){ 
        System.out.println("melakukan bagi");
        return a / b;
    }
}