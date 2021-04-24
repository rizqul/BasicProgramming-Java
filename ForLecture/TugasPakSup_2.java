import java.util.Scanner;

public class TugasPakSup_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int limit = sc.nextInt();
        String []nama = new String[limit];
        int []nilai = new int[limit];
        int sum = 0;
        

        for (int i = 0; i < limit; i++) {
            nama[i] = sc.next();
            nilai[i] = sc.nextInt();
        }

        int top[][] = new int[3][2];

        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < 3; j++) {
                if(nilai[i] > top[j][1]){
                    for (int k = 0; k < 3; k++) {
                        if(top[j][1] > top [k][1]){  
                           top[k][0]=j;
                            top[k][1] = top[j][1];
                            break;
                        }
                    }
                    top[j][0]=i;
                    top[j][1]=nilai[i];
                    break;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            sum += top[i][1];
        } 

        System.out.println(sum);
        for (int i = 0; i < 3; i++) {
            System.out.println(nama[top[i][0]]);
        }
    }
}