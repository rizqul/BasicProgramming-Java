import java.util.Scanner;

public class Materi_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int ukuran = sc.nextInt();
        int arr [][] = new int [ukuran][ukuran];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr [i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
        int jumlah = sc.nextInt();
        if (jumlah == 1){
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][i];
            System.out.println(sum);
        } 
    }else if (jumlah == 2){
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][arr.length - i - 1];
            }
            System.out.println(sum);
        }
    }
}