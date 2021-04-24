import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();

        int[] fibonacci = new int[49];
        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < 49; i++) {
            int f3 = f1 + f2;
            fibonacci[i] = f1;
            f1 = f2;
            f2 = f3;
        }

        List<Integer> notFibonacci = new ArrayList<>();

        for (int i = 0; i < 999999; i++) {
            boolean tes = false;
            for (int j = 0; j < 48; j++) {
                if(i == fibonacci[j]){
                    tes = true;
                }
            }
            if(tes == false){
                notFibonacci.add(i);
            }
        }

        System.out.println(notFibonacci.get(in - 1));
    }
}