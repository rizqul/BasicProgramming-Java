
import java.util.Scanner;

public class Materi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        int b = 0;
        int i;        
        for (i = 0; i < a.length;i++){
            System.out.println("Masukkan nilai " + i);
            a[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        for (i = 0; i < a.length; i++) {
            if (c == a[i]){
                b++;
            }
        }
        
        if (b > 0){
            System.out.println("angka " + c + " ada " + b);
        } else{
            System.out.println("tak ada");
        }
    }
}