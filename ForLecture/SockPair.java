import java.util.*;

public class SockPair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sockColor = new int[n];

        for (int i = 0; i < sockColor.length; i++) {
            sockColor[i] = sc.nextInt();
        }

        int simpan1 = 0;
        Arrays.sort(sockColor);

        for (int i = 0; i < sockColor.length; i++) {
            System.out.print(sockColor[i] + " ");
        }

        for(int i = 0; i < sockColor.length - 1; i++){
            if(sockColor[i] == sockColor[i+1]){
                simpan1++;
                i++;
            }
        }

        System.out.println();
        System.out.println(simpan1);
    }
}