import java.util.Scanner;


public class Test_14 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tes = sc.nextInt();
        int i = 0;

        while (i < tes){
            System.out.println("lopping " + i);
            i++;
        }

        do{
            System.out.println("looping "+i);
            i++;
        }while(i < tes);

    }
}