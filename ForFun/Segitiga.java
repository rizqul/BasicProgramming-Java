import java.util.Scanner;

public class Segitiga{
    public static void main(String[] args){     // Main Method
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan alas ");
         int a = input.nextInt();
       
        System.out.println("masukkan tinggi ");
         int b = input.nextInt();

         input.close();
       
        int luas;
        luas = (a*b)/2;
        double sisiMiring = Math.sqrt(Math.pow((a/2), 2) + Math.pow(b, 2));
        double keliling = (2*sisiMiring) + a;
        System.out.println("kelilingnya adalah = " + keliling);
        System.out.println("sisi miringnya adalah = " + sisiMiring);
        System.out.println("luas adalah = " + luas);


    }
}