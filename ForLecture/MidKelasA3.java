import java.util.Scanner;

public class MidKelasA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int range = sc.nextInt();
        if(range >= 26){
            range = range % 26;
        }
        int numberLength[] = new int[range];
        char alphabet[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int i = 0; i < range; i++) {
            numberLength[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = numberLength[0]; i <= numberLength[range - 1]; i++) {
            if (i % range == 0 || range % i == 0){
                System.out.print(alphabet[i] + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}