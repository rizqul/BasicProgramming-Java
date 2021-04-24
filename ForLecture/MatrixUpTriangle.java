import java.io.FileWriter;
import java.util.Scanner;

public class MatrixUpTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ordo = sc.nextInt();
        int[][] matrix = new int[ordo][ordo];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int save = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                save += matrix[i][j];
                System.out.println(i + "," + j + " = " + matrix[i][j]);
            }
        }
        System.out.println(save);

        FileWriter out = null;
        try {
            String fileName = sc.next();
            out = new FileWriter(fileName + ".txt");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    out.write(matrix[i][j] + " ");
                }
                out.write("\n");
            }

            out.write("Hasil dari Penjumlahan matriks segitiga atas = " + save);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(out != null){
                    out.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}