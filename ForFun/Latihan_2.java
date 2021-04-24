import java.util.Scanner;

public class Latihan_2 {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka ");
        int a = sc.nextInt();

       /* if (a<5){
            System.out.println("pernyataan 1");
        }
        else if(a==5){
            System.out.println("pernyataan 2");
        }
        else {
            System.out.println("pernyataan 3");
        }
        */

        
        if (a%2 == 0){
            if(a>=10){
                if(a>=100){
                    System.out.println("a adalah bilangan genap yg lebih dari 10 kurang dari 100");
                }
                else {
                    System.out.println("a adalah bilangan genap yg lebih dari 10 dan kurang dari 100");
                }
            }
            else {
                System.out.println("a adalah bilangan genap yg kurang dari 10 dan kurang dari 100");
            }
        }

        else {
            if (a>=10){
                if (a>=100){
                    System.out.println(" a adalah bilangan ganjil yang lebih dari 10 dan lebih dari 100");
                }
                 else {
                    System.out.println("a adalah bilangan ganjil yang lebih dari 10 dan kurang dari 100");
                }
                
            }
            else {
                System.out.println("a adalah bilangan ganjil yang kurang dari 10 dan kurang dari 100");
            }
            
        }

    }
}