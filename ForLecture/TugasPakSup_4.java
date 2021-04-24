import java.util.Scanner;

public class TugasPakSup_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int value = sc.nextInt();
        int ukuran[] = new int[value];
        boolean stock = false;
        String []warna = new String[value];

        for (int i = 0; i < value; i++) {
            ukuran[i] = sc.nextInt();
            warna[i] = sc.next();
        }
        System.out.println("ukuran yang di cari");
        int wishSize = sc.nextInt();
        System.out.println("warna yang di cari");
        String wishColor = sc.next();

        for (int i = 0; i < value; i++) {
            if (ukuran[i] == wishSize && warna[i].equalsIgnoreCase(wishColor)){
                System.out.printf("ada pada sepatu ke-%d ",i+1);
                stock = true;
            }
        }
        if(stock == false){
            System.out.println("sepatu yang di cari tidak ada");
        }
    }
}