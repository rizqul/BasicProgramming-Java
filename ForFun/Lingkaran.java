import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double jari = sc.nextDouble();
        double luas = Math.PI*Math.pow(jari, 2); // pangkat untuk bilangan "Double"
        double keliling = Math.PI*2*jari;
        System.out.println("keliling = " + keliling);
        System.out.println("luas = " + luas);
        System.out.printf("luas = %.3f\n" ,luas); // Batasi berapa angka di belakang ","
        System.out.printf("keliling = %.3f\n" ,keliling); // Batasi berapa angka di belakang ","
    }
}