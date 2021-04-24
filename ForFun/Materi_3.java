import java.util.Scanner;
// import java.util.Array;

public class Materi_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int [][] arr = new int [2][2];

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < max; j++) {
        //         arr [i][j] = sc.nextInt();
        //     }
        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }else {
                    arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}