//array adalah kumpulan data dengan tipe yang sama
//komponen penting array 1.indeks = menjelaskan posisi sebuah data( start nya dimana); 2.elemen = isi data;
//misal int a = 1,4,5,3,22; {1.4.5.3.22} = elemen
//a [2] = 5; = {2} = indeks;
// contoh
import java.util.Scanner;

public class Materi_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];                                       // jika 2 dimensi(int a[][] = new int[4][4];)
        int sum = 0;
        int sumData = 0;

        // a[0] = 2;
        // a[1] = 5;
        // a[2] = 12;
        // a[3] = 41;

        // System.out.println(a[1]);

        for (int i = 0; i < a.length;i++){
            System.out.println("Masukkan nilai " + i);
            a[i] = sc.nextInt();
            sum += i;
            sumData += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Nilai-Nilai nya adalah"+a[i]);
        }
        System.out.println("Jumlah Indeks = " + sum);
        System.out.println("jumlah nilai array = " + sumData);

    }
}