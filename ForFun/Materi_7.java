import java.util.Scanner;

public class Materi_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0 ){
                arr[i] = 1;
            }
            System.out.println("X["+i+"] = "+arr[i] + " ");
        }
    }
}