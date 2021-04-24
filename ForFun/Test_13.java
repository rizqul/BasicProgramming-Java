import java.util.Scanner;

public class Test_13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        String s = a % 2 == 0 ? "genap" : "ganjil" ;
            //                    TRUE   FALSE

        System.out.println(s);


    }
}