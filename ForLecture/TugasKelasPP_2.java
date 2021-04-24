import java.util.Scanner;

public class TugasKelasPP_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang = sc.nextInt();
        int arr[] = new int[60];

        arr[0] = 0;
        arr[1] = 1;

       
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int j = 0; j < panjang; j++) {
            int input = sc.nextInt();
            System.out.println(arr[input]);
        }
    }
}