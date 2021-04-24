import java.util.Scanner;
import java.util.Random;

public class TugasKelasPP_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int[][] arr1 = new int[input1][input1];
        int[][] arr2 = new int[input2][input2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                do
                {
                arr1[i][j] = rd.nextInt(4);
                }
                while(arr1[i][j] == 0);
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

                for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                do
                {
                arr2[i][j] = rd.nextInt(4);
                }
                while(arr2[i][j] == 0);
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }
    }
}