import java.util.Scanner;
import java.util.Arrays;

public class Test_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] totalOfArrays = new int[n];

        for (int i = 0; i<totalOfArrays.length ; i ++){
            totalOfArrays[i]=sc.nextInt();
        }
        Arrays.sort(totalOfArrays);
        System.out.println(Arrays.toString(totalOfArrays));
    }
}