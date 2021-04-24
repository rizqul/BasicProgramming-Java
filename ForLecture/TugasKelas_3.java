import java.util.Scanner;

public class TugasKelas_3{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int jumlah = 0;

    for (int i = 1; i <= a; i++){
        if (i%2!=0){
        System.out.printf("%d ",i);
        jumlah++;
        }
    }
    System.out.println( "\n" + jumlah);

    }    
}