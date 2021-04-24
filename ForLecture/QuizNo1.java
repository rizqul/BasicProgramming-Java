import java.util.Arrays;
import java.util.Scanner;

public class QuizNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int index = sc.nextInt();
        int[] arr = new int[index];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int simpanIndexBesar = 0;
        int simpanNilaiBesar = 0;
        int gantiBesar = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    if (gantiBesar < arr[i]) {
                        simpanIndexBesar = i;
                        simpanNilaiBesar = arr[i];    
                    } else{
                        break;
                    }
                } else {
                    continue;
                }
            }
            gantiBesar = simpanNilaiBesar;
        }

        int simpanIndexKecil = 0;
        int simpanNilaiKecil = 0; 
        int gantiKecil = arr[1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    if (gantiKecil > arr[i]) {
                        simpanIndexKecil = i;
                        simpanNilaiKecil = arr[i];    
                    } else{
                        break;
                    }
                } else {
                    continue;
                }
            }
            gantiKecil = simpanNilaiKecil;
        }

        System.out.println(simpanIndexBesar);
        System.out.println(simpanNilaiBesar);
        System.out.println(simpanIndexKecil);
        System.out.println(simpanNilaiKecil);

        
    }
}