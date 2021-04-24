import java.util.Scanner;

public class TugasKelas_7{
    public static void main(String []args){
        Scanner nope = new Scanner(System.in);
        int y1;
        double y2;
        double y3;
        System.out.println("Persamaan Ke-1");
        for(int x1 = 0; x1<=50; x1+=5){
            y1 =  4*x1 + 1;
            System.out.printf("\nx = %d dan y = %d",x1,y1);
        }

        System.out.println("\n\nPersamaan Ke-2");
        for(double x2 = 1; x2<=10;x2+=1){
            y2 = Math.sqrt(x2) - 1;
            System.out.printf("\nx = %.0f dan y = %.2f",x2,y2);
        }

        System.out.println("\n\nPersamaan Ke-3");
        for(double x3 = 1; x3<=5; x3+=0.5){
            y3 = (5 * x3 *x3) + (3 *x3) - 2;
            System.out.printf("\nx = %.2f dan y = %.2f",x3,y3);
        }

    }
}