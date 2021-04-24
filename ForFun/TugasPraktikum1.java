import java.util.Scanner;
public class TugasPraktikum1{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    scan.close();
    Double a = scan.nextDouble();
    Double b = scan.nextDouble();
    Double c = scan.nextDouble();

    Double result1 = (-b + Math.sqrt(Math.pow(b,2)) - 4*a*c) / (2*a);
    Double result2 = (-b - Math.sqrt(Math.pow(b,2)) - 4*a*c) / (2*a);

    System.out.println(result1);
    System.out.println(result2);
  }
}
