import java.util.Scanner;
public class Test_30 {
    public static int result (int a, int b){
        int ready = a + b;
        return ready;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(result(input1, input2));
    }
    
}