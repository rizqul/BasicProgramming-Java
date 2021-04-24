import java.util.Scanner;

public class TugasLatihan_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = "";

        char[] arr = str.toCharArray();
        char[] arr1 = new char[(arr.length/2) + (arr.length%2)];
        char[] arr2 = new char[arr.length/2];
        System.out.println(arr.length);
        

        for (int i = 0; i < (arr1.length); i++) {
            arr1[i] = arr[i];   
            System.out.println(arr1[i]);
        }

        for (int i = 0; i < (arr2.length); i++) {
            arr2[i] = arr[i];   
            System.out.println(arr2[i]);
        }
    }
}