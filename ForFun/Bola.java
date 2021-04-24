import java.util.Scanner;

public class Bola {
    public static void main(String[] args) {
        


    Scanner tes = new Scanner(System.in);

    System.out.println("masukkan jari-jari ");
    double jari = tes.nextDouble();
    
    double volume = Math.PI*Math.pow(jari, 3)*4/3;
    
    System.out.println("volume dari bola adalah = " + volume);
    }
}