import java.util.Scanner;

public class TugasKelas_1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int jumlah = 0;

    for (int i = 1; i <= a; i++){
        if (a%i==0){
        jumlah = jumlah + i;
        System.out.println(i);
        }
    }

    }    
}