import java.util.Scanner;

public class Latihan_1 {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("masukkan bilangan");
    int a = sc.nextInt();  

    if (a%2 == 0){
        System.out.printf("bilangan tersebut adalah bilangan genap");
         }
    
    else if (a%2 != 0){
        System.out.printf("bilangan tersebut adalah bilangan ganjil");
        }
    
    if (a > 10){
        System.out.printf(" yang lebih dari 10");
        }
    else if (a < 10){
        System.out.printf(" yang kurang dari 10");
        }
    
    if (a>100){
        System.out.printf(" dan lebih dari 100");
    }
    else if (a<100){
        System.out.printf(" dan kurang dari 100");
    }

    }



}