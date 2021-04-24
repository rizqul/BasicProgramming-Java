import java.util.Scanner;
public class Test_17{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0 ; i < a; i--){
            System.out.print(i + " = ");
            
            for  (int j = 0; j<11;  j--){
                System.out.print(" o ");
            }
       
        }
     }
    }
