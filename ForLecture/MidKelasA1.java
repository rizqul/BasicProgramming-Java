import java.util.Scanner;

public class MidKelasA1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pilih jurusan : ");
        System.out.println("1. Saintek \n2. Soshum");
        int jurusan = sc.nextInt();        

        if(jurusan == 1) {
            System.out.println("Masukkan nilai Matematika");
            int nilaiMtk = sc.nextInt();
            System.out.println("Masukkan Nilai Fisika");
            int nilaiFsk = sc.nextInt();

            double rataSaintek = (nilaiFsk + nilaiMtk) / 2;
            System.out.println("Rata - rata = "+rataSaintek);

            if (rataSaintek >= 550 && rataSaintek <= 600){
            System.out.println("anda lulus di ilmu komputer");
            }

            if (rataSaintek >= 601 && rataSaintek <= 650){
                System.out.println("anda lulus di FKM");
            }

            if (rataSaintek >= 651 && rataSaintek <= 1000){
                System.out.println("anda lulus di Kedokteran");
            }
        }

        if(jurusan == 2) {
            System.out.println("Masukkan Nilai Matematikan Soshum");
            int nilaiMtkSoshum = sc.nextInt();
            System.out.println("Masukkan Nilai Geografi");
            int nilaiGeografi = sc.nextInt();

            double rataSoshum = (nilaiMtkSoshum + nilaiGeografi) / 2;
            System.out.println("Rata - rata = "+rataSoshum);

            if (rataSoshum >= 450 && rataSoshum <= 600){
            System.out.println("anda lulus di Sastra jepang");
            }

            if (rataSoshum >= 601 && rataSoshum <= 650){
                System.out.println("anda lulus di Ekonomi");
            }

            if (rataSoshum >= 651 && rataSoshum <= 1000){
                System.out.println("anda lulus di Hukum");
            }
        }
    }
}