import java.util.Scanner;

public class Test_21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int factor = 0;
        int i;

        for (i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                if (i % j == 0 ){
                    factor++;
                }    
            }
           if (factor == 2){
            System.out.println(i);
            }
            factor = 0;
        }
    }
}