import java.util.Scanner;

public class Latihan_3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int bilanganTerbesar=0;
        int bilanganTerkecil=0;
     
        
        if (x>y && x>z){
                bilanganTerbesar = x;    
        }

        else if (y>x && y>z){
                bilanganTerbesar = y;
        }

        else if (z>x && z>y){
                bilanganTerbesar = z;
        }

        if (x<y && x<z){
             bilanganTerkecil = x;
        }
        else if (y<x && y<z){
             bilanganTerkecil = y;
        }
        else if (z<x && z<y){
             bilanganTerkecil = z;
        }

        System.out.println("bilangan terbesar adalah " + bilanganTerbesar);
        System.out.println("bilangan terkecil adalah " + bilanganTerkecil);
        
        double rataRata = (bilanganTerbesar + bilanganTerkecil)*0.5;
        
        System.out.println(rataRata );




        
    }
}