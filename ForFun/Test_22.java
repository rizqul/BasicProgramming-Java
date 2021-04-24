import java.util.Scanner;

public class Test_22 {
    public static void main (String[] args){
        Scanner inputan = new Scanner(System.in);
        
        int numberOfFactor = inputan.nextInt();
        int factor = 0;
        int jumlahFaktor = 0;
        int i;
        
        for (i = 1; ; i++){
            for(int j = 2; j <= i; j++){
                if (i % j == 0 ){
                    factor++;
                }    
            }
           if (factor == 2){
            System.out.println(i);
            jumlahFaktor++;
        }
        factor = 0;
            
            if (jumlahFaktor == numberOfFactor){
                break;
            }
        }

    }
}