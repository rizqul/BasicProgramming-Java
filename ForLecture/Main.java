import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        for (int i = 1; i <= 9; i+=2) {
            for (int j = i + 6; j >= i +4; j--) {
                System.out.printf("I=%d J=%d\n",  i, j);
            }
        }
    }
}