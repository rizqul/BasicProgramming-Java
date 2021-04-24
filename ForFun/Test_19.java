import java.util.Scanner;

class Test_19 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int batas = key.nextInt();
        int angka;
        
        for (int i = 1; i < batas; i++) {
            if (i%i == 0 && i%1 ==0){
            System.out.println(i);
            }
        }
    }
}