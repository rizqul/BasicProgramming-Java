import java.util.Scanner;
import java.io.FileWriter;


public class NumberTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        int[][] arr = new int[lines][lines];


        FileWriter write = null;
        try {
            String name = sc.next();
            write = new FileWriter(name +".txt");

            for (int i = 0; i < lines; i++){

                for(int j = lines ; j > i; j--){
                    write.write(" ");
                }
    
                for(int k = 0; k <= i; k++){
    
                    if(i == k || k == 0){
                        arr[i][k] = 1;
                    }
                    else{
                        arr[i][k] = arr[i-1][k-1] + arr[i-1][k]; 
                    }
                    write.write( arr[i][k] + " ");
                }
                write.write("\n");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (write != null){
                    write.close();
                    System.out.println("Berhasil");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}