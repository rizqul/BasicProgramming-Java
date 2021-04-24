import java.util.Scanner;

public class Test_9 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();       //  0 < a < 5
    sc.close();

    switch (a){
        case 1 : 
        System.out.println("hari pagi");
        break;
        case 2 :
        System.out.println("hari siang");
        break;
        case 3 :
        System.out.println("hari sore");
        break;
        case 4 :
        System.out.println("hari malam");
        break;
        default : System.out.println("error");
    }

    }
}