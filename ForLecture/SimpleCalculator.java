import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("tata cara pemakaian");
        System.out.println("(angka1) (operasi) (angka2)");
        System.out.println("contoh : 2 tambah 3");

        try {
            int number1 = sc.nextInt();
            String operation = sc.next();
            int number2 = sc.nextInt();
    
    
            switch(operation) {
                case "tambah" :
                System.out.print(number1 + " + "+ number2 + " = " + plus(number1, number2));
                break;
    
                case "kurang" :
                System.out.println(number1 + " - "+ number2 + " = " + minus(number1, number2));
                break;
    
                case "kali" :
                System.out.println(number1 + " * "+ number2 + " = " + multiple(number1, number2));
                break;
    
                case "bagi" :
                System.out.println(number1 + " / "+ number2 + " = " + divided((double) number1, (double)number2));
                break;
    
                case "mod" :
                System.out.println(number1 + " % "+ number2 + " = " + modulo(number1, number2));
                break;
    
    
            }    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("error");
        }
        
    }

    
    static int plus (int a, int b){
        int c = a + b;
        return c;
    }

    static int minus (int a, int b){
        int c = a - b;
        return c;
    }

    static int multiple (int a, int b){
        int c = a * b;
        return c;
    }

    static double divided (double a, double b){
        double c = a / b;
        return c;
    }

    static int modulo (int a, int b){
        int c = a % b;
        return c;
    }
}