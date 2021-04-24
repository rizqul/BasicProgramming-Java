import java.util.Scanner;

public class SharpFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 2*n;

        if(n < 3)
            return;
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i == 0 || i == n - 1 || j == 0){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("#");
        }
    }
}