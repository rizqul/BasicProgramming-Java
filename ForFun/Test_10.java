import java.util.Scanner;

public class Test_10 {
    public static void main ( String [] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
try{
    int b = 9/a;} catch(Exception e){
    System.out.println(e);
}
    System.out.println("Tak Bisa Membagi Integer Dengan Nol");
    }

}