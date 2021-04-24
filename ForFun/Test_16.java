import java.util.Scanner;;

public class Test_16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan banyak bilangan");
        int n = sc.nextInt();
        System.out.println("masukkan bilangan khusus");
        int nilaiKhusus = sc.nextInt();


        double jumlah = 0;
        int ganjil = 0;
        int jumlahNilaiKhusus = 0;
        int max = Integer.MIN_VALUE;

        System.out.println("masukkan bilangannya");
        

        for (int i = 0; i<n;i++ ){
            int a = sc.nextInt();
            jumlah = jumlah + a;
            if (a%2!=0){
                ganjil++;
            }
            if (a == nilaiKhusus){
                jumlahNilaiKhusus++;
            }

            if (a > max){
                max = a;
            }
        }



        double rata2 = jumlah/n;

        System.out.println(jumlah);
        System.out.println(rata2);
        System.out.println(ganjil);
        System.out.println(jumlahNilaiKhusus);
        System.out.println(max);
    }
}