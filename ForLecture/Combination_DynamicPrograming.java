import java.util.Scanner;

public class Combination_DynamicPrograming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] combi = new long[n + 1][n + 1];

        for (int i = 1; i < combi.length; i++) {
            for (int j = 1; j < combi.length; j++) {
                if (i == 0 && j == 0) {
                    combi[i][j] = 1;
                } else if (i == j) {
                    combi[i][j] = 1;
                } else {
                    combi[i][j] = combi[i-1][j-1] + combi[i-2][i-2];
                }
            }
        }

        for (int i = 0; i < combi.length; i++) {
            for (int j = 0; j < combi.length; j++) {
                System.out.println(combi[i][j]);
            }
        }
    }
}
