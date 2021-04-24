import java.util.Scanner;

public class Test_8 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        sc.close();
        int a = sc.nextInt();
        int b = sc.nextInt();
        a--;
        b++;
        
        int hasil = a%b;
        int po = 2;
        po += po;       // artinya -> sum= sum + sum

        System.out.println(hasil);
        System.out.println(a);
        System.out.println(b);
    }
}
