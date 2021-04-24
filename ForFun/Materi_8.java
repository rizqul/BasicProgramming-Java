import java.util.Scanner;

public class Materi_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();

        int matriks1 [][] = new int [baris][kolom];
        int matriks2 [][] = new int [baris][kolom];
        int matriks3 [][] = new int [baris][kolom];

        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1.length; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2.length; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Hasil");

        for (int i = 0; i < matriks3.length; i++) {
            for (int j = 0; j < matriks3.length; j++) {
                matriks3[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(matriks3[i][j] + " ");
            }
        System.out.println();
        }


    }
}