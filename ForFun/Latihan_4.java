import java.util.Scanner;

public class Latihan_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a%b==0){
            System.out.println(a + " adalah kelipatan " + b);
        }
        else {
            System.out.println(a + " bukan kelipatan dari " + b);
        }
    }
}