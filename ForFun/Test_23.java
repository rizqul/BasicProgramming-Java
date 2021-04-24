import java.util.Arrays;
public class Test_23 {
    public static void main(String [] args){
        int[] arr = {1,2,3,4};
        int[] rra = {4,5,6,7};
        Arrays.sort(arr);

        System.out.println(arr[0]);

        System.out.println("array menggunakan perulangan biasa"+"\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);   
        }
        System.out.println("\n"+"array menggunakan perulangan ForEach"+"\n");
        for (int contoh : rra){
            System.out.print(contoh);
        }
    }
}