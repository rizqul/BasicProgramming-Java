import java.util.Scanner;

public class Latihan_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah kehadiran");
        int a = sc.nextInt();

        System.out.println("apakah ikut praktikum");
        boolean b = sc.nextBoolean();

        System.out.println("masukkan nilai tugas");
        int c = sc.nextInt();
        System.out.println("masukkan nilai quiz");
        int d = sc.nextInt();
        System.out.println("masukkan nilai mid");
        int e = sc.nextInt();
        System.out.println("masukkan nilai final");
        int f = sc.nextInt();

        double kehadiran = (a*100)/16;
        double totalNilai = ((c * 0.2) + (d * 0.25) + (e * 0.25) + (f * 0.30) );
        
        if (kehadiran >= 80 ) {
            if (b == true){
                if(totalNilai >= 45 ){
                    System.out.println("anda lulus");
                }
                else {
                    System.out.println("anda tidak lulus");
                }
            }
            else {
                System.out.println("anda tidak lulus");
            }
        }
        else {
            System.out.println("anda tidak lulus");
        }
        System.out.println(totalNilai);
        System.out.println(kehadiran);

    }
}