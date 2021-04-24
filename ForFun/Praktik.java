import java.util.Scanner;
public class Praktik{
  public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    Float x1 = scan.nextFloat();
    Float y1 = scan.nextFloat();
    Float x2 = scan.nextFloat();
    Float y2 = scan.nextFloat();
    scan.close();

    Float result1 = x2 - x1;
    Float result2 = y2 - y1;
    System.out.println(result1);
    System.out.println(result2);
    Double result3 = (Math.pow(result1,2)) + (Math.pow (result2,2));
    Double result4 = Math.sqrt(result3);
    System.out.println(result4);

  }
}
