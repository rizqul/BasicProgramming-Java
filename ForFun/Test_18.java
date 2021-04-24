import java.util.Scanner;

public class Test_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int fn1 = 1;
        int fn2 = 0;
        int fn =1 ;
        


        for (int i = 0; i<a ;i++){
            System.out.println(fn);

            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
           
        }
    }
}