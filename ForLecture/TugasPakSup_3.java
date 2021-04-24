import java.util.Scanner;

public class TugasPakSup_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();

        int [][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matriks[(baris-1)-j][i] + " ");
            }
            System.out.println();
        }


    }
}