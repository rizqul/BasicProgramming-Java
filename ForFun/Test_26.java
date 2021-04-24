import java.util.Arrays;
import java.util.Scanner;

public class Test_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int target = 0;
        int indeks = 0;

        for (int i = 0 ; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        
        int b = sc.nextInt();
        
        for(int i = 0; i < a.length; i++){
            if(a[i]==b){
                target++;
                i = indeks;
            }
        }

        if (target > 0){
            System.out.println("angka "+b+" terdapat pada di indeks ke-"+indeks);
        } else {
            System.out.println("angka "+b+" tidak ditemukan");
        }
    }
}