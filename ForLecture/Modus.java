import java.util.Scanner;

public class Modus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numberValue = sc.nextInt();
        int arr[] = new int[numberValue];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        int simpan2 = 0;
        int simpan3 = 0;
        for(int i = 0; i<arr.length; i++){
            int simpan1 = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    simpan1++;
                }
            }
            if (simpan1 > simpan2){
                simpan2 = arr[i];
            }
            if (simpan2 > simpan3) {
                simpan3 = simpan2;
            }
        }

        System.out.println(simpan3);
    }
}