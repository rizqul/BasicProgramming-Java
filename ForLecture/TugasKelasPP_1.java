import java.util.Scanner;

public class TugasKelas_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int panjang = sc.nextInt();
        if(panjang >= 50 || panjang < 0){
            System.out.println("-1 < inputan < 50");
            return;
        }
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            panjang += panjang;
            arr[i] = panjang;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.printf("N[%d] = %d\n",j,arr[j]);
        }
    }
}