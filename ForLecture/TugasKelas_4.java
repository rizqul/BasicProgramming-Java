import java.util.Scanner;

public class TugasKelas_4{

public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif = 0;

        for (int i = 0; i<5; i ++){
            int z = sc.nextInt();
            if (z < 0){
                negatif++;
            }
            if (z > 0){
                positif++;
            }
            if (z%2==0){
                genap++;
            }
            if (z%2!=0){
                ganjil++;
            }
            
        }

        System.out.println("genap = "+genap);
        System.out.println("ganjil = "+ganjil);
        System.out.println("positif = "+positif);
        System.out.println("negatif = "+negatif);






    }
}