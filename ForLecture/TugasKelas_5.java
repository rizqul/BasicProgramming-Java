import java.util.Scanner;

public class TugasKelas_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bilanganPokok = sc.nextInt();
        int pangkat = sc.nextInt();
        double bilanganPokok2 = bilanganPokok;
        int i;
        if (pangkat > 0){
            System.out.printf("%.0f ^ %d = ", bilanganPokok, pangkat);
        for(i = 1; i < pangkat; i++){
            bilanganPokok = bilanganPokok * bilanganPokok2;   
        }
        System.out.printf("%.0f",bilanganPokok);
        } else if (pangkat < 0) {
            System.out.printf("%.0f ^ %d = ", bilanganPokok, pangkat);
            for (i = -1;i>pangkat;i--){
                bilanganPokok = bilanganPokok * bilanganPokok2;
            }
            double hasil = 1/bilanganPokok;
            System.out.printf("%.3f",hasil);
        } else {
            System.out.printf("%.0f ^ %d = ", bilanganPokok, pangkat);
            System.out.printf("1");



        }
    }
}