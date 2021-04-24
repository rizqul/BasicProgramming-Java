import java.util.Arrays;
import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int target = 0;
        int indeks = 0;
        boolean truth = false;

        for (int i = 0 ; i < a.length; i++){
            a[i] = sc.nextInt();
        }
                
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length; j++){
                if (a[j] == a[i]){
                    target++;
                    indeks = j;
                    truth = true;
                }
            }
        }
        if (target > 4){
            System.out.println("ada angka yang sama");
        } else{
             System.out.println("tak ada angka yang sama");
    }
        System.out.println(target);
        System.out.println(indeks);
        System.out.println(truth);

    }
}