import java.util.Scanner;

public class Balok {
    
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        System.out.println("masukkan panjang ");
        double panjang = tes.nextDouble();
        
        System.out.println("masukkan lebar ");
        double lebar = tes.nextDouble();
        
        System.out.println("masukkan tinggi ");
        double tinggi = tes.nextDouble();
        tes.close();

        double rumusVolume = panjang*lebar*tinggi;
        double rumusLuasPermukaan = 2*panjang*lebar  +  2*panjang*tinggi + 2*lebar*tinggi;

        System.out.println("Volumenya adalah = " + rumusVolume);
        System.out.println("luas permukaannya adalah = " + rumusLuasPermukaan);


    }
}