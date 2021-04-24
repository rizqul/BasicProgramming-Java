import java.util.Scanner;

public class TugasPakSup_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int kelas[] = new int [a];
        for (int i = 0; i < a; i++) {
            
            int jumlah = sc.nextInt();
            int nilai[] = new int[jumlah];
            int kasus = 0;
            int jumlahNilai = 0;
            
            for (int j = 0; j < nilai.length; j++) {
                nilai[j] = sc.nextInt();
                jumlahNilai += nilai[j];
            }
    
            double rata = jumlahNilai/jumlah;
    
            for (int j = 0; j < nilai.length; j++) {
                if (nilai[j] < rata){
                    kasus++;
                }
            }
            kelas[i] = kasus;
        }
        for (int i = 0; i < kelas.length; i++) {
        System.out.println(kelas[i]);
            
        }
    }
}