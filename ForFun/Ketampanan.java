import java.util.Scanner;

public class Ketampanan {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       int a = sc.nextInt();

       int year = a / 365;
       int b = a % 365;

       int c = b %  31;
       int d = c % 28;
       int e = d % 31;
       int f = e % 30;
       int g = f % 31;
       int h = g % 30;
       int i = h % 31;
       int j = i % 31;
       int k = j % 30;
       int l = k % 31;
       int m = l % 30;
       int n = m % 31;

       int o = 0 ;
       int p = 0 ;
       int q = 0 ;
       int r = 0 ;
       int t = 0 ;
       int u = 0 ;
       int v = 0 ;
       int w = 0 ;
       int x = 0 ;
       int y = 0 ;
       int z = 0 ;
       int aa = 0 ;
       
       if (c > 0 && c != b){
           o = 1;
           if (d > 0 && d != c){
               p = 1;
           }
       }


       System.out.println(b);
    }
}
