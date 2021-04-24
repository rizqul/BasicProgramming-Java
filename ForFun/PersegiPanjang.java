import java.util.Scanner;

public class PersegiPanjang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan panjang ");
        double panjang = sc.nextDouble();

        System.out.println();
        double lebar = sc.nextDouble();
        sc.close();


        double luas = panjang*lebar;
        double keliling = (panjang + lebar)*2;
        

        System.out.println("luas persegi panjang tersebut adalah = " + luas);
        System.out.println("keliling persegipanjang tersebut adalah = " + keliling);


    }
}