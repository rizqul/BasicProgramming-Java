import java.util.*;

public class NumberOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int loop = 1;
        while(n>=0 && n<200){
            int count = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) { 
                    count++;
                }
            }
            System.out.print("Kasus " + loop+": ");
            System.out.println(count+" angka");
            int a = 1;
            System.out.print(a-1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" "+a);
                }
                a++;
            }
            System.out.println();
            System.out.println();
            n=sc.nextInt();
            loop++;

        }

    }
}