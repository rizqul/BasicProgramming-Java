import java.util.Scanner;

public class MidKelasA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int baris = sc.nextInt();
        int kolom = sc.nextInt();

        if(baris != kolom){
            System.out.println("baris dan kolom tidak sama");
            return;
        }

        int sumKiri = 0;
        int sumKanan = 0;

        int [][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal kiri = ");
        for (int i = 0; i < baris; i++) {
            System.out.print(matriks[i][i] + " ");
        }
        System.out.println();
        System.out.println("Diagonal kanan = ");
        for (int i = 0; i < baris; i++) {
            System.out.print(matriks[i][baris - i - 1] + " ");
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (matriks[i][i] > matriks[j][j]){
                    sumKiri = matriks[i][i];
                }
                if (matriks[i][baris - i - 1] > matriks[j][kolom - j -1]){
                    sumKanan = matriks[i][baris - i -1];
                }
            }
        }
        System.out.println();
        System.out.println("Nilai max Diagonal kiri = "+sumKiri);
        System.out.println("Nilai max Diagonal kanan = "+sumKanan);


    }
}