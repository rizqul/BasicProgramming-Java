import java.util.Scanner;

public class Test_12 {
    public static void main ( String [] args){

        Scanner sc = new Scanner(System.in);
        try {
        int a = sc.nextInt();
        if (a>0){
            throw new NumberFormatException();
        }
    } catch (NumberFormatException nfe){

        System.out.println(nfe.getMessage());
    } finally {
        sc.close();
    }

        System.out.println("Tak Bisa Membagi Integer Dengan Nol");
    }
}

